package com.waiqin365.firstdemo.sometest.jvmtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/22 10:52
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用List保持着常量池的引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<>();
        //10M的permSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
