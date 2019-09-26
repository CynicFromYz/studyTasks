package com.waiqin365.firstdemo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class KafkaReceiver {
    private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());

    @KafkaListener(topicPartitions={@TopicPartition(partitions="4",topic="zhangsan")},groupId = "123")
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            log.info("----------------- record =" + record);
            log.info("------------------ message =" + message);
        }

    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(null);
        list.add("b");
//        Optional caseStr = Optional.ofNullable(firstStr);
//        System.out.println(.isPresent());
        Optional.ofNullable(list).ifPresent(list1 -> list.stream().forEach(str -> {
                    Optional.ofNullable(str).ifPresent(str1 -> System.out.println(str1));
                }

        ));
    }
}
