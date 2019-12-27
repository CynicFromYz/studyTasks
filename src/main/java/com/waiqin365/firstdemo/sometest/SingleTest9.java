package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.*;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/29 11:22
 */
public class SingleTest9 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int c = 100;
                try {
                    int a = 1;
                    int b = 0;
                    Thread.sleep(5000);
                    c = a / b;
                } catch (Exception e) {
                    throw new Exception();
                }
                System.out.println(c);
                return c;
            }
        });
        System.out.println(future.get(6,TimeUnit.SECONDS));
    }

    public static int getMain() {
        int c = 100;
        try {
            int a = 1;
            int b = 0;
            c = a / b;
        } catch (Exception e) {

        }
        return c;
    }


}
