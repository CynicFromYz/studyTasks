package com.waiqin365.firstdemo.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.waiqin365.firstdemo.domain.Message;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Properties;
import java.util.UUID;

@Component
public class KafkaSender {

    private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        message.setName("cynic_test");
//        log.info("====================  message = {}", gson.toJson(message));
//        kafkaTemplate.send("zhangsan", 4, "key", gson.toJson(message));
        kafkaTemplate.send("zhangsan",gson.toJson(message));
        kafkaTemplate.send("wangwu",gson.toJson(message));
        Producer producer = new KafkaProducer(new Properties());
        producer.send(new ProducerRecord<String, String>("topic", "key", "message"));
    }
}
