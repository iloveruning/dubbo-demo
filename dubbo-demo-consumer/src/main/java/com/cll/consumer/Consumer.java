package com.cll.consumer;

import com.cll.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenliangliang
 * @date 2018/4/14
 */
public class Consumer {


    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack","true");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-consumer.xml"}
        );
        context.start();
        DemoService demoService=context.getBean(DemoService.class);
        while (true){
            try {
                Thread.sleep(1000);
                String hello=demoService.say("dubbo demo");
                System.out.println(hello);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
