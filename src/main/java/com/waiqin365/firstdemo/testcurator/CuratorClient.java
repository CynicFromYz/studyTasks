package com.waiqin365.firstdemo.testcurator;

import cn.hutool.core.date.DateUtil;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/21 16:51
 */
public class CuratorClient {
    public static String zkAddr = "106.12.50.184:2181";

    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework;
        curatorFramework = CuratorFrameworkFactory.builder().connectString(zkAddr)
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .namespace("curator")
                .build();
        curatorFramework.start();
//        curatorFramework
//                .create()//创建Znode
//                .creatingParentsIfNeeded()//如果是多级结点,这里声明如果需要,自动创建父节点
//                .withMode(CreateMode.EPHEMERAL)//声明结点类型
//                .forPath("/ephemeral","waiqin".getBytes());//声明结点路径和值
//        TimeUnit.SECONDS.sleep(10);
//        curatorFramework.close();
//        Stat stat = new Stat();
//        System.out.println(new String(curatorFramework.getData().storingStatIn(stat).forPath("/04")));
//        System.out.print("目前版本为:" + stat.getVersion() + "创建时间为:" + DateUtil.formatDateTime(new Date(stat.getCtime())));
        final NodeCache nodeCache = new NodeCache(curatorFramework, "/04", false);
        NodeCacheListener nodeCacheListener = () -> System.out.println("事件路径:" + nodeCache.getCurrentData().getPath() + "发生数据变化,新数据为" + new String(nodeCache.getCurrentData().getData()));
        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start();
        curatorFramework.setData().forPath("/04","love".getBytes());
        TimeUnit.SECONDS.sleep(5);
    }
}
