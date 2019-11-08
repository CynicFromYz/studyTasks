package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/30 8:37
 */
public class ChildMe extends FooMe{

    @Override
    public void printFirstFooBefore() {
        System.out.println("childMethod");
    }

    @Override
    public void printFirstFooAfter() {
        System.out.println("childMethod");
    }
}
