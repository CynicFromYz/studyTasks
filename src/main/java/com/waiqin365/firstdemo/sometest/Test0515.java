package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/15 10:05
 */
public class Test0515 {

    static CountDownLatch countDownLatch = new CountDownLatch(1);
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "123");

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Thread(() -> {
            threadLocal.set("321");
            System.out.println("线程中threadLocal值:" + threadLocal.get());
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
        System.out.println(threadLocal.get());
    }

}
