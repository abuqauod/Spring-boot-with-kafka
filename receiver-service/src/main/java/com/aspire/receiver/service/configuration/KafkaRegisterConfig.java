package com.aspire.receiver.service.configuration;

import com.aspire.receiver.service.channels.ReceiverChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(ReceiverChannel.class)
public class KafkaRegisterConfig {
}
