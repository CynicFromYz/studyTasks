package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/24 20:25
 */
public class Test1 {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> System.out.println(LazySingleton.getLazySingletonInstance().hashCode()));
        }
        executorService.shutdown();
        Thread thread = new Thread(() -> System.out.println(LazySingleton.getLazySingletonInstance().hashCode()));
        thread.start();
    }


}
