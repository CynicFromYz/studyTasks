package com.waiqin365.firstdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.waiqin365.firstdemo.util.ZkDistributedLockUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableDubbo
public class FirstDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FirstDemoApplication.class);
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(FirstDemoApplication.class, args);
//        KafkaSender sender = context.getBean(KafkaSender.class);
//        for (int i = 0; i < 3; i++) {
//            //调用消息发送类中的消息发送方法
//            sender.send();
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
