package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Single4Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.countDown();
        boolean isFinish = countDownLatch.await(5, TimeUnit.SECONDS);
        System.out.println(isFinish);
    }

}
