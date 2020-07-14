package com.waiqin365.firstdemo.sometest;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/7/2 15:17
 */
public class Test0702 {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future future2  = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                throw new Exception();
            }
        });
        System.out.println(future2.get());
    }
}
