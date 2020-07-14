package com.waiqin365.firstdemo.sometest;

import com.google.common.base.Preconditions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/13 16:01
 */
public class HashMapTest {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("key", "val");
//        //List Set
//        Collections.synchronizedCollection(new ArrayList<>());
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//
//        }
//
//        Hashtable hashtable = new Hashtable();
//        HashMap hashMap = new HashMap();
//        hashMap.put("不只Java-1", 1);
//        hashMap.put("不只Java-2", 2);
//        hashMap.put("不只Java-3", 3);
//
//        Set set = hashMap.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            hashMap.put("下次循环会抛异常", 4);
//            System.out.println("此时 hashMap 长度为" + hashMap.size());
//        }
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//        concurrentHashMap.put("不只Java-1", 1);
//        concurrentHashMap.put("不只Java-2", 2);
//        concurrentHashMap.put("不只Java-3", 3);
//
//        Set set = concurrentHashMap.entrySet();
//        Iterator iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            concurrentHashMap.put("下次循环正常执行", 4);
//        }
//        System.out.println("程序结束");
        List<String> list = new ArrayList();
        list.add("123");
//        Iterator<String> iterable = list.iterator();
//        while (iterable.hasNext()){
//            System.out.println(iterable.next());
//        }

//        for (String str : list) {
//            list.remove(2);
//        }
//        Cat cat = null;
//        Preconditions.checkArgument(cat != null, "123%s","meeessas");
        Map<String,String> map = new HashMap<>();
        map.put("String","100");
        map.put("String1","100");
        map.put("String2","100");
        map.put("String3","100");
        map.put("String4","100");
        map.put("String5","100");
        map.put("String6","100");
        map.put("String7","100");
        map.put("String8","100");
        map.put("String9","100");
        map.put("String10","100");
        map.put("String11","100");
        map.put("String12","100");
        map.put("String13","100");
        map.put("String14","100");
        map.put("String14","100");
        map.put("String141","100");
        map.put("String12241","100");
        map.put("String1224","100");
        map.put("String14","100");
        map.put(null,"123");
        map.keySet().forEach(a->{
            System.out.println(a);
        });

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//        List<Animal> animals =
        concurrentHashMap.put(null,"null");
        System.out.println(concurrentHashMap.get(null));

        Map map1 = new HashMap(256);
        TreeMap treeMap = new TreeMap();
    }
}
