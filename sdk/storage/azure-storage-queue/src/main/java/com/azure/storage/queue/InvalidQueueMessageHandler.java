package com.azure.storage.queue;

import reactor.core.publisher.Mono;

public interface InvalidQueueMessageHandler {
    Mono<Void> onInvalidMessage(QueueAsyncClient queueAsyncClient, Object message);
}
