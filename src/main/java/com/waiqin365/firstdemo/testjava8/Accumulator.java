package com.waiqin365.firstdemo.testjava8;

import java.util.stream.LongStream;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/9 20:13
 */
public class Accumulator {
    public static long total = 0;
    public static void add(long value){
        total += value;
    }
}
