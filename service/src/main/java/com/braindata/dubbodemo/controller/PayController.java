package com.braindata.dubbodemo.controller;

import com.braindata.dubbodemo.intf.StuRpcService;
import com.braindata.rocketmq.Producer;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pay")
public class PayController {
    @DubboReference(version = "1.0.0", group = "dubbo-demo")
    StuRpcService stuRpcService;

    @Autowired
    private Producer producer;

    @GetMapping(value = "/toPay")
    public String pay(){
        int a = stuRpcService.add(5,1);
        return "success!" + a;
    }

    @GetMapping(value = "/sendMessage")
    public String sendMessage(
            @RequestParam("msg") String msg
    ){
        return producer.sendMsg(msg)? "true":"false";
    }
}
