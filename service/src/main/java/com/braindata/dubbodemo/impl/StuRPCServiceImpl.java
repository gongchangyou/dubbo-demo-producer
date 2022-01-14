package com.braindata.dubbodemo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.braindata.dubbodemo.intf.StuRpcService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/13 1:44 下午
 */
@Component
@DubboService(version = "1.0.0", group = "dubbo-demo") //group是小的分类
public class StuRPCServiceImpl implements StuRpcService {
    @Override
    public int add(int i, int j) {
        return i + j;
    }
}
