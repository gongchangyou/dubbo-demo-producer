package com.braindata.dubbodemo;

import com.braindata.rocketmq.MessageSource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageSource.class)
@SpringBootApplication(scanBasePackages = {"com.braindata" })
//@EnableNacosDiscovery
//@DubboComponentScan(value = "com.braindata.dubbodemo.impl")
@EnableDubbo(scanBasePackages = "com.braindata.dubbodemo.impl")
@MapperScan("com.braindata.dubbodemo.repository.db.mapper")
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
