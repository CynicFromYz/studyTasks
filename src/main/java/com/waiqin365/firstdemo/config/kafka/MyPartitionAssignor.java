package com.waiqin365.firstdemo.config.kafka;

import org.apache.kafka.clients.consumer.internals.AbstractPartitionAssignor;
import org.apache.kafka.common.TopicPartition;

import java.util.List;
import java.util.Map;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/15 9:24
 */
public class MyPartitionAssignor extends AbstractPartitionAssignor {

    @Override
    public Map<String, List<TopicPartition>> assign(Map<String, Integer> map, Map<String, Subscription> map1) {
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
