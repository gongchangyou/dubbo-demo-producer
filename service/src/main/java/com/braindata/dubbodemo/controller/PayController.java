package com.braindata.dubbodemo.controller;

import com.braindata.dubbodemo.intf.StuRpcService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pay")
public class PayController {
    @DubboReference(version = "1.0.0", group = "dubbo-demo")
    StuRpcService stuRpcService;

    @GetMapping(value = "/toPay")
    public String pay(){
        int a = stuRpcService.add(5,1);
        return "success!" + a;
    }
}
