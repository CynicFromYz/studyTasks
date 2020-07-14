package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/14 18:46
 */
public class Test0514 {
    public static void main(String[] args) {
        String a = "ssT211RN221G";
        int code = a.hashCode()& 1;
        System.out.println(code);
        String a1 = "ZZZZ";
        int code1 = a1.hashCode()& 1;
        System.out.println(code1);
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
    }
}
