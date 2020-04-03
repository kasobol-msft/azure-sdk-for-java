// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.implementation.util;

import com.azure.storage.common.ParallelTransferOptions;
import com.azure.storage.common.implementation.Constants;
import com.azure.storage.common.implementation.StorageImplUtils;

/**
 * This class provides helper methods for common model patterns.
 *
 * RESERVED FOR INTERNAL USE.
 */
public class ModelHelper {

    /**
     * Indicates the maximum number of bytes that can be sent in a call to upload.
     */
    private static final long MAX_APPEND_FILE_BYTES = 4000L * Constants.MB;

    /**
     * The block size to use if none is specified in parallel operations.
     */
    private static final long FILE_DEFAULT_UPLOAD_BLOCK_SIZE = 4 * Constants.MB;

    /**
     * The number of buffers to use if none is specified on the buffered upload method.
     */
    private static final int FILE_DEFAULT_NUMBER_OF_BUFFERS = 8;

    /**
     * Fills in default values for a ParallelTransferOptions where no value has been set. This will construct a new
     * object for safety.
     *
     * @param other The options to fill in defaults.
     * @return An object with defaults filled in for null values in the original.
     */
    public static ParallelTransferOptions populateAndApplyDefaults(ParallelTransferOptions other) {
        other = other == null ? new ParallelTransferOptions() : other;

        // For now these two checks are useful for when we transition to
        if (other.getBlockSizeLong() != null) {
            StorageImplUtils.assertInBounds("ParallelTransferOptions.blockSize", other.getBlockSizeLong(), 1,
                MAX_APPEND_FILE_BYTES);
        }

        if (other.getMaxSingleUploadSizeLong() != null) {
            StorageImplUtils.assertInBounds("ParallelTransferOptions.maxSingleUploadSize",
                other.getMaxSingleUploadSizeLong(), 1, MAX_APPEND_FILE_BYTES);
        }

        return new ParallelTransferOptions()
            .setBlockSize(other.getBlockSizeLong() == null ? Long.valueOf(FILE_DEFAULT_UPLOAD_BLOCK_SIZE)
                : other.getBlockSizeLong())
            .setNumBuffers(other.getNumBuffers() == null ? Integer.valueOf(FILE_DEFAULT_NUMBER_OF_BUFFERS)
                : other.getNumBuffers())
            .setProgressReceiver(other.getProgressReceiver())
            .setMaxSingleUploadSize(other.getMaxSingleUploadSizeLong() == null ? Long.valueOf(MAX_APPEND_FILE_BYTES)
                : other.getMaxSingleUploadSizeLong());
    }
}
