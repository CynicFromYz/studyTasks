package com.waiqin365.firstdemo.sometest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/17 18:32
 */
public class CompletableFutureTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> futureA = CompletableFuture.supplyAsync(() -> 100);
        CompletableFuture<Double> futureB = CompletableFuture.supplyAsync(() -> 0.8);
        CompletableFuture<Double> futureC = futureA.thenCombine(futureB, (a,b) -> {
            System.out.println("a参数是:" + a); //500
            System.out.println("b参数是:" + b); //0.8
            return a * b;
        });
        System.out.println(futureC.get());
    }
}
