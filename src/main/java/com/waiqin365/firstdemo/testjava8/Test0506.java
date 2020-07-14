package com.waiqin365.firstdemo.testjava8;

import org.springframework.util.Assert;

import java.util.concurrent.CountDownLatch;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/5/6 9:50
 */
public class Test0506 {
    static CountDownLatch countDownLatch = new CountDownLatch(1);
    public static void main(String[] args) throws InterruptedException {
//        CompletableFuture cf = CompletableFuture.runAsync(() -> {
//            System.out.println(Thread.currentThread().isDaemon());
//        });
//        assertFalse(cf.isDone());
//        countDownLatch.await();
//        assertTrue(cf.isDone());
    }
}
