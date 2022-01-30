package com.braindata.rocketmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/26 5:00 下午
 */
@Component
public class Producer {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private StreamBridge messageChannel;

    public boolean sendMsg(String msg) {
        return messageSource.output1().send(MessageBuilder.withPayload(msg).build());
//        return messageChannel.send("test-topic", MessageBuilder.withPayload("{\"a\":134}").build());
    }
}
