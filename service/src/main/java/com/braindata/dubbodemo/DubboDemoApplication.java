package com.braindata.dubbodemo;

import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import com.braindata.rocketmq.MessageSource;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageSource.class)
@SpringBootApplication(scanBasePackages = {"com.braindata" })
//@EnableNacosDiscovery
//@DubboComponentScan(value = "com.braindata.dubbodemo.impl")
@EnableDubbo(scanBasePackages = "com.braindata.dubbodemo.impl")
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
