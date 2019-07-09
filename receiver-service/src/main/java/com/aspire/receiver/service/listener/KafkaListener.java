package com.aspire.receiver.service.listener;

import com.aspire.receiver.service.channels.ReceiverChannel;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class KafkaListener {

    @StreamListener(ReceiverChannel.BINDING_RECEIVER)
    public void listener(@Payload String name) {
        System.err.printf("From Receiver, Your name is:- %s\n", name);
    }
}
