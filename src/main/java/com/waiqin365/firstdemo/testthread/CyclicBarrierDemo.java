package com.waiqin365.firstdemo.testthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/15 10:11
 */
public class CyclicBarrierDemo {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(()->{
                try {
                    play();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void play() throws BrokenBarrierException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + " 已准备");
        cyclicBarrier.await();
        System.out.println(Thread.currentThread().getName() + " 开始执行");
    }
}
