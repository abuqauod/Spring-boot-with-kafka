package com.aspire.receiver.service.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReceiverChannel {

    String BINDING_RECEIVER = "kafka-receiver-topic";

    @Input(BINDING_RECEIVER)
    SubscribableChannel subscribableChannel();
}
