package com.waiqin365.firstdemo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaReceiver {
    private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());


    @KafkaListener(topics = "#{'${topics}'.split(',')}",groupId = "123")
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            log.info("---------consumer-------- record =" + record);
            log.info("---------consumer--------- message =" + message);
        }

    }

}
