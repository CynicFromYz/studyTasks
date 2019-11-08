package com.waiqin365.firstdemo.sometest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/15 19:44
 */
public class Single8Test {
    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws IOException {
//        String a = "123";
//        updateValue(a);
//        System.out.println(a);
        ChildMe childMe = new ChildMe();
        childMe.fooMethod();
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        applicationContext.getBean("");
        String[] arr = new String[]{"1"};
    }

    static void updateValue(String c){
        c = "456";
    }

}
