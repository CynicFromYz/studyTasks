package com.waiqin365.firstdemo.testthread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/15 10:16
 */
public class CountDownLatchDemo {

    public static CountDownLatch countDownLatch = new CountDownLatch(5);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"=====已经准备完毕");
                        countDownLatch.countDown();
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"======执行中");
                }
            }).start();
        }
    }
}
