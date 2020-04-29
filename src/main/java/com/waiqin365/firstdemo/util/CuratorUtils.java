package com.waiqin365.firstdemo.util;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/21 17:19
 */
@Component
public class CuratorUtils {

    @Autowired
    CuratorFramework curatorFramework;

    public void createZnode(String path, String value) throws Exception {
        curatorFramework
                .create()//创建Znode
                .creatingParentsIfNeeded()//如果是多级结点,这里声明如果需要,自动创建父节点
                .withMode(CreateMode.PERSISTENT)//声明结点类型
                .forPath(path, value.getBytes());//声明结点路径和值
    }

    public void deleteZnode(String path) throws Exception {
        curatorFramework
                .delete()
                .deletingChildrenIfNeeded()//如果有子节点,会先自动删除子节点再删除本结点
                .forPath(path);
    }

    public String getZnodeData(String path) throws Exception {
        Stat stat = new Stat();
        byte[] dataBytes = curatorFramework.getData().storingStatIn(stat).forPath(path);
        System.out.print("目前版本为:" + stat.getVersion() + "创建时间为:" + stat.getCtime());
        return new String(dataBytes);
    }

    public void setValue(String path, String value) throws Exception {
        Stat stat = curatorFramework.checkExists().forPath(path);
        if (stat == null) {
            System.out.println("Znode does not exists");
        } else {
            curatorFramework.setData().withVersion(stat.getVersion()).forPath(path, value.getBytes());
        }
    }

    public void addWatcherWithNodeCache(String path) throws Exception {
        final NodeCache nodeCache = new NodeCache(curatorFramework, path, false);
        NodeCacheListener nodeCacheListener = new NodeCacheListener() {
            @Override
            public void nodeChanged() {
                System.out.println("事件路径:" + nodeCache.getCurrentData().getPath() + "发生数据变化,新数据为" + new String(nodeCache.getCurrentData().getData()));
            }
        };
        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start();
    }

}
