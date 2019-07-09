package com.aspire.service.two.configuration;

import com.aspire.service.two.channels.SenderChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SenderChannel.class)
public class RegisterKafkaConfig {
}
