// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.blob.specialized;

import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.AppendBlobRequestConditions;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.blob.models.PageBlobRequestConditions;
import com.azure.storage.blob.models.PageRange;
import com.azure.storage.blob.models.ParallelTransferOptions;
import com.azure.storage.common.StorageOutputStream;
import com.azure.storage.common.implementation.Constants;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/**
 * BlobOutputStream allows for the uploading of data to a blob using a stream-like approach.
 */
public abstract class BlobOutputStream extends StorageOutputStream {

    BlobOutputStream(final int writeThreshold) {
        super(writeThreshold);
    }

    static BlobOutputStream appendBlobOutputStream(final AppendBlobAsyncClient client,
        final AppendBlobRequestConditions appendBlobRequestConditions) {
        return new AppendBlobOutputStream(client, appendBlobRequestConditions);
    }

    /**
     * Creates a block blob output stream from a BlobAsyncClient
     * @param client {@link BlobAsyncClient} The blob client.
     * @param parallelTransferOptions {@link ParallelTransferOptions} used to configure buffered uploading.
     * @param headers {@link BlobHttpHeaders}
     * @param metadata Metadata to associate with the blob.
     * @param tier {@link AccessTier} for the destination blob.
     * @param requestConditions {@link BlobRequestConditions}
     * @return {@link BlobOutputStream} associated with the blob.
     */
    public static BlobOutputStream blockBlobOutputStream(final BlobAsyncClient client,
        final ParallelTransferOptions parallelTransferOptions, final BlobHttpHeaders headers,
        final Map<String, String> metadata, final AccessTier tier, final BlobRequestConditions requestConditions) {
        return new BlockBlobOutputStream(client, parallelTransferOptions, headers, metadata, tier, requestConditions);
    }

    static BlobOutputStream pageBlobOutputStream(final PageBlobAsyncClient client, final PageRange pageRange,
        final BlobRequestConditions requestConditions) {
        return new PageBlobOutputStream(client, pageRange, requestConditions);
    }

    abstract void commit();

    /**
     * Closes this output stream and releases any system resources associated with this stream. If any data remains in
     * the buffer it is committed to the service.
     *
     * @throws IOException If an I/O error occurs.
     */
    @Override
    public synchronized void close() throws IOException {
        try {
            // if the user has already closed the stream, this will throw a STREAM_CLOSED exception
            // if an exception was thrown by any thread in the threadExecutor, realize it now
            this.checkStreamState();

            // flush any remaining data
            this.flush();

            // try to commit the blob
            try {
                this.commit();
            } catch (final BlobStorageException e) {
                throw new IOException(e);
            }
            /* Need this check because for block blob the buffered upload error only manifests itself after commit is
               called */
            if (this.lastError != null) {
                throw lastError;
            }
        } finally {
            // if close() is called again, an exception will be thrown
            this.lastError = new IOException(Constants.STREAM_CLOSED);
        }
    }

    private static final class AppendBlobOutputStream extends BlobOutputStream {
        private static final String INVALID_BLOCK_SIZE =
            "Block data should not exceed BlockBlobURL.MAX_STAGE_BLOCK_BYTES";

        private final AppendBlobRequestConditions appendBlobRequestConditions;
        private final AppendBlobAsyncClient client;

        private AppendBlobOutputStream(final AppendBlobAsyncClient client,
            final AppendBlobRequestConditions appendBlobRequestConditions) {
            super(AppendBlobClient.MAX_APPEND_BLOCK_BYTES);
            this.client = client;
            this.appendBlobRequestConditions = (appendBlobRequestConditions == null)
                ? new AppendBlobRequestConditions() : appendBlobRequestConditions;

            if (this.appendBlobRequestConditions.getAppendPosition() == null) {
                this.appendBlobRequestConditions.setAppendPosition(client.getProperties().block().getBlobSize());
            }
        }

        private Mono<Void> appendBlock(Flux<ByteBuffer> blockData, long writeLength) {
            long newAppendOffset = appendBlobRequestConditions.getAppendPosition() + writeLength;
            return client.appendBlockWithResponse(blockData, writeLength, null, appendBlobRequestConditions)
                .doOnNext(ignored -> appendBlobRequestConditions.setAppendPosition(newAppendOffset))
                .then()
                .onErrorResume(t -> t instanceof IOException || t instanceof BlobStorageException, e -> {
                    this.lastError = new IOException(e);
                    return Mono.empty();
                });
        }

        @Override
        protected Mono<Void> dispatchWrite(byte[] data, int writeLength, long offset) {
            if (writeLength == 0) {
                return Mono.empty();
            }

            // We cannot differentiate between max size condition failing only in the retry versus failing in the
            // first attempt and retry even for a single writer scenario. So we will eliminate the latter and handle
            // the former in the append block method.
            if (appendBlobRequestConditions.getMaxSize() != null
                && appendBlobRequestConditions.getAppendPosition() > appendBlobRequestConditions.getMaxSize()) {
                this.lastError = new IOException(INVALID_BLOCK_SIZE);
                return Mono.error(this.lastError);
            }

            Flux<ByteBuffer> fbb = Flux.range(0, 1).concatMap(pos -> Mono.fromCallable(() ->
                ByteBuffer.wrap(data, (int) offset, writeLength)));

            return this.appendBlock(fbb.subscribeOn(Schedulers.elastic()), writeLength);
        }

        @Override
        void commit() {
            // AppendBlob doesn't need to commit anything.
        }
    }

    private static final class BlockBlobOutputStream extends BlobOutputStream {

        private FluxSink<ByteBuffer> sink;

        boolean complete;

        private BlockBlobOutputStream(final BlobAsyncClient client,
            final ParallelTransferOptions parallelTransferOptions, final BlobHttpHeaders headers,
            final Map<String, String> metadata, final AccessTier tier, final BlobRequestConditions requestConditions) {
            super(Integer.MAX_VALUE); // writeThreshold is effectively not used by BlockBlobOutputStream.

            Flux<ByteBuffer> fbb = Flux.create((FluxSink<ByteBuffer> sink) -> this.sink = sink);

            /* Subscribe by upload takes too long. We need to subscribe so that the sink is actually created. Since
             this subscriber doesn't do anything and no data has started flowing, there are no drawbacks to this extra
             subscribe. */
            fbb.subscribe();

            client.uploadWithResponse(fbb, parallelTransferOptions, headers, metadata, tier, requestConditions)
                // This allows the operation to continue while maintaining the error that occurred.
                .onErrorResume(BlobStorageException.class, e -> {
                    this.lastError = new IOException(e);
                    return Mono.empty();
                })
                .doOnTerminate(() -> complete = true)
                .subscribe();
        }

        @Override
        void commit() {
            sink.complete();

            // Need to wait until the uploadTask completes
            while (!complete) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    // Does this need to be caught by logger?
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected void writeInternal(final byte[] data, int offset, int length) {
            sink.next(ByteBuffer.wrap(data, offset, length));
        }

        // Never called
        @Override
        protected Mono<Void> dispatchWrite(byte[] data, int writeLength, long offset) {
            return Mono.empty();
        }
    }

    private static final class PageBlobOutputStream extends BlobOutputStream {
        private static final String INVALID_NUMBER_OF_BYTES_IN_THE_BUFFER =
            "Page data must be a multiple of 512 bytes. Buffer currently contains %d bytes.";

        private final ClientLogger logger = new ClientLogger(PageBlobOutputStream.class);
        private final PageBlobAsyncClient client;
        private final PageBlobRequestConditions pageBlobRequestConditions;
        private final PageRange pageRange;

        private PageBlobOutputStream(final PageBlobAsyncClient client, final PageRange pageRange,
            final BlobRequestConditions blobRequestConditions) {
            super(PageBlobClient.MAX_PUT_PAGES_BYTES);
            this.client = client;
            this.pageRange = pageRange;

            if (blobRequestConditions != null) {
                this.pageBlobRequestConditions = new PageBlobRequestConditions()
                    .setLeaseId(blobRequestConditions.getLeaseId())
                    .setIfMatch(blobRequestConditions.getIfMatch())
                    .setIfNoneMatch(blobRequestConditions.getIfNoneMatch())
                    .setIfModifiedSince(blobRequestConditions.getIfModifiedSince())
                    .setIfUnmodifiedSince(blobRequestConditions.getIfUnmodifiedSince());
            } else {
                this.pageBlobRequestConditions = null;
            }
        }

        private Mono<Void> writePages(Flux<ByteBuffer> pageData, int length, long offset) {
            return client.uploadPagesWithResponse(new PageRange().setStart(offset).setEnd(offset + length - 1),
                pageData, null, pageBlobRequestConditions)
                .then()
                .onErrorResume(BlobStorageException.class, e -> {
                    this.lastError = new IOException(e);
                    return Mono.empty();
                });
        }

        @Override
        protected Mono<Void> dispatchWrite(byte[] data, int writeLength, long offset) {
            if (writeLength == 0) {
                return Mono.empty();
            }

            if (writeLength % PageBlobAsyncClient.PAGE_BYTES != 0) {
                return Mono.error(new IOException(String.format(INVALID_NUMBER_OF_BYTES_IN_THE_BUFFER,
                    writeLength)));
            }

            Flux<ByteBuffer> fbb = Flux.range(0, 1)
                .concatMap(pos -> Mono.fromCallable(() -> ByteBuffer.wrap(data, (int) offset, writeLength)));

            long pageOffset = pageRange.getStart();
            if (pageOffset + writeLength - 1 > pageRange.getEnd()) {
                throw logger.logExceptionAsError(
                    new RuntimeException("The input data length is larger than the page range."));
            }
            pageRange.setStart(pageRange.getStart() + writeLength);
            return this.writePages(fbb.subscribeOn(Schedulers.elastic()), writeLength, pageOffset);
        }

        @Override
        void commit() {
            // PageBlob doesn't need to commit anything.
        }
    }
}
