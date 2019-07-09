package com.aspire.service.two.api;

import com.aspire.service.two.channels.SenderChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requests")
public class ServiceOneRest {

    private final SenderChannel channel;

    @Autowired
    public ServiceOneRest(SenderChannel channel) {
        this.channel = channel;
    }

    @PostMapping
    public ResponseEntity<Boolean> sendEvent(String name) {
        MessageBuilder<String> mesasge = MessageBuilder.withPayload(name);

        boolean isSent = channel.messageChannel().send(mesasge.build());

        return ResponseEntity.status(HttpStatus.OK).body(isSent);
    }
}
