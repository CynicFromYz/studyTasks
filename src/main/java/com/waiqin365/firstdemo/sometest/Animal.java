package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/13 13:18
 */
public class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
