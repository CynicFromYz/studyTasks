package com.waiqin365.firstdemo.sometest;

import java.util.Comparator;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/13 13:18
 */
public class Cat extends Animal implements Comparable<Cat>{
    String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return -1;
    }
}
