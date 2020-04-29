package com.waiqin365.firstdemo.config.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/21 17:12
 */
public class ZkConfig {

    @Value("${curator.zkAddr}")
    private String clusterNodes;

    @Bean
    public CuratorFramework getCuratorFramework(){
        CuratorFramework curatorFramework;
        curatorFramework = CuratorFrameworkFactory.builder().connectString(clusterNodes)
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .namespace("curator")
                .build();
        curatorFramework.start();
//        curatorFramework
//                .create()//创建Znode
//                .creatingParentsIfNeeded()//如果是多级结点,这里声明如果需要,自动创建父节点
//                .withMode(CreateMode.PERSISTENT)//声明结点类型
//                .forPath("/04/21/1700","waiqin".getBytes());//声明结点路径和值
       return curatorFramework;
    }
}
