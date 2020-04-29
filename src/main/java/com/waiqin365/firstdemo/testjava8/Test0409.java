package com.waiqin365.firstdemo.testjava8;

import java.util.stream.LongStream;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/9 20:15
 */
public class Test0409 {
    public static void main(String[] args) {
        System.out.println(sideEffectSum(10000000));
    }
    public static long sideEffectSum(long n){
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1,n).parallel().forEach(Accumulator::add);
        return accumulator.total;
    }
}
