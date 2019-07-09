package com.aspire.service.two.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface SenderChannel {
    @Output("kafka-sender-topic")
    MessageChannel messageChannel();
}
