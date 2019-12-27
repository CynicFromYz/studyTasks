package com.waiqin365.firstdemo.sometest;

import com.google.gson.Gson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

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
//        ChildMe childMe = new ChildMe();
//        childMe.fooMethod();
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
//        applicationContext.getBean("");
//        String[] arr = new String[]{"1"};
//        Observer observer = new Observer() {
//            @Override
//            public void update(Observable o, Object arg) {
//
//            }
//        };
//       int a = ("123".hashCode())%50 ;
//        System.out.println(a);
//        String c = "123";
//        c.intern();
//        String str1 = new StringBuilder("计算机").append("软件").toString();
//        System.out.println(str1.intern()==str1);
//        String str2 = new StringBuilder("java").append("va").toString();
//        System.out.println(str2.intern()==str2);
//        String jsonStr = "[]";
//        Gson gson = new Gson();
//        List<Map<String, String>> positionList = gson.fromJson(jsonStr, List.class);
//        String a = "123456789";
//        Map map = new HashMap();
//        map.put("a",a);
//        long b = (long) map.get("a");
//        System.out.println(b);
        Map map1 = new HashMap();
        map1.put("num","1");
        List list = new ArrayList();
        list.add(map1);
        Map map2 = (Map) list.get(0);
        map2.put("num","2");
        System.out.println(((Map) list.get(0)).get("num"));
    }

    static void updateValue(String c){
        c = "456";
    }

}
