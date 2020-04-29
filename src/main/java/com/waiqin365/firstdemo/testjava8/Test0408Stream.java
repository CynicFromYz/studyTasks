package com.waiqin365.firstdemo.testjava8;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/8 17:26
 */
public class Test0408Stream {
    public static void main(String[] args) {
        System.out.println(measureSumPerf(Test0408Stream::getSum,10000000)); //105
        System.out.println("==============================================");
        System.out.println(measureSumPerf(Test0408Stream::getSumParallel,10000000)); //257
        System.out.println("==============================================");
        System.out.println(measureSumPerf(Test0408Stream::getSumOldJava,10000000)); //5
        System.out.println("==============================================");
        System.out.println(measureSumPerf(Test0408Stream::GetRangeClosedSumParallel,10000000)); //1
    }
    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + duration);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

    //iterate
    public static long getSum(long n){
        return Stream.iterate(1L, i->i+1).limit(n).reduce(0L,Long::sum);
    }
    //iterate Parallel
    public static long getSumParallel(long n){
        return Stream.iterate(1L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);
    }
    //Java Old
    public static long getSumOldJava(long n){
        long sum = 0;
        for(int i = 0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static long GetRangeClosedSumParallel(long n){
        return LongStream.rangeClosed(1,n).parallel().reduce(0L,Long::sum);
    }
}
