package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/30 8:36
 */
public class FooMe {

    public void fooMethod(){
        this.printFirstFooBefore();
        System.out.println("foo method");
        this.printFirstFooAfter();
    }

    public void printFirstFooBefore(){
        System.out.println("Foo method");
    }

    public void printFirstFooAfter(){
        System.out.println("Foo method");
    }
}
