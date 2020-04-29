package com.waiqin365.firstdemo;

import com.waiqin365.firstdemo.util.EncryptionUtils;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/11 10:54
 */
public class ZkClientTest implements Watcher {

    public static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static ZooKeeper zooKeeper;

    public static String zkAddr = "106.12.50.184:2181";

    public static int timeoutSeconds = 5000;


    public ZkClientTest() throws IOException {
    }


    public static void main(String[] args) throws KeeperException, InterruptedException, IOException {
//        String nodeCreated = zooKeeper.create("/cynic_local_waiqin", "cynic".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//        String data = new String(zooKeeper.getData("/cynic", watchedEvent -> {
//            System.out.println("get data");
//        }, null));
//
//        System.out.println(data);
//        Stat stat = zooKeeper.exists("/cynic",true);
//        System.out.println(JSONUtil.toJsonStr(stat));
        zooKeeper = new ZooKeeper(zkAddr, timeoutSeconds, new ZkClientTest());
        countDownLatch.await();
        System.out.println("连接成功......");
        String pwd = EncryptionUtils.shaEncrypt(EncryptionUtils.base64Encode("root"));
        ACL acl = new ACL(ZooDefs.Perms.CREATE, new Id("digest", "user:" + pwd));
        List<ACL> aclList = new ArrayList<>();
        aclList.add(acl);
        zooKeeper.create("/perms", "perms".getBytes(), aclList, CreateMode.EPHEMERAL);
        zooKeeper.addAuthInfo("digest", "root:root".getBytes());
        TimeUnit.SECONDS.sleep(5);
//        String dataPerms = new String(zooKeeper.getData("/perms", true, null));
//        System.out.println(dataPerms);
        List<ACL> aclV2 = zooKeeper.getACL("/perms", zooKeeper.exists("/perms", false));
        for (ACL acl1 : aclV2) {
            System.out.println(acl1.getPerms());
            System.out.println(acl1.getId());
        }

    }

    @Override
    public void process(WatchedEvent watchedEvent) {
        if (watchedEvent.getState().equals(Watcher.Event.KeeperState.SyncConnected)) {
            countDownLatch.countDown();
            System.out.println("进入监视器,连接成功......");
        }
        if (watchedEvent.getState().equals(Watcher.Event.KeeperState.AuthFailed)) {
            countDownLatch.countDown();
            System.out.println("进入监视器,认证失败......");
        }
    }
}
