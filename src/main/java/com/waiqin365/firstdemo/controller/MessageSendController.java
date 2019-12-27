package com.waiqin365.firstdemo.controller;

import com.waiqin365.firstdemo.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/14 18:35
 */
@Controller
@RequestMapping("/message")
public class MessageSendController {

    @Autowired
    KafkaSender kafkaSender;

    @RequestMapping("/send")
    public void kafkaMessageSend() {
        for (int i = 0; i < 3; i++) {
            //调用消息发送类中的消息发送方法
            kafkaSender.send();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
