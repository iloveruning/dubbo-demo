package com.cll.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author chenliangliang
 * @date 2018/4/14
 */
public class Provider {


    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-provider.xml"}
        );
        context.start();
        System.out.println("注册服务成功");
        System.in.read();
    }
}
