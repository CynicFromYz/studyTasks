package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/17 15:05
 */
public class CompletableFutureTest {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Long currentMillisBefore = System.currentTimeMillis();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return 1;
            }
        });
        Future<Integer> future2 = executorService.submit(() -> {
            Thread.sleep(5000);
            return 2;
        });
        System.out.println(future.get(3,TimeUnit.SECONDS));
        System.out.println(future2.get());
        Long currentMillisAfter = System.currentTimeMillis();
        System.out.println("耗时:" + (currentMillisAfter - currentMillisBefore));
        executorService.shutdown();
//        CompletableFuture.supplyAsync(new Thread1(), executorService).whenComplete(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//                System.out.println(s);
//            }
//        });
//        executorService.shutdown();
    }

    static class Thread1 implements Supplier, Runnable {

        @Override
        public Object get() {
            System.out.println("321");
            return "are u silly b ?";
        }

        @Override
        public void run() {
            System.out.println("123");
        }
    }

    class Thread2 implements Runnable {

        @Override
        public void run() {
            System.out.println("123");
        }
    }
}
