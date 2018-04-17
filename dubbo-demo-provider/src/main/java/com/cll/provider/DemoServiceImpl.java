package com.cll.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.cll.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenliangliang
 * @date 2018/4/14
 */
public class DemoServiceImpl implements DemoService {


    public String say(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
