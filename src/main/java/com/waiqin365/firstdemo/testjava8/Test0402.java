package com.waiqin365.firstdemo.testjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/2 14:03
 */
public class Test0402 {
    public static void main(String[] args) {
//        List<String> strs = new ArrayList<>();
//        List<PineApple> apples = new ArrayList<>();
//        //Predicate 返回一个boolean
//        Predicate<String> s11 = strs::add;
//        List<String> atr = Arrays.asList("a","c","D","E");
////        atr.sort((s1,s2)->s1.compareToIgnoreCase(s2));
//        atr.sort(String::compareToIgnoreCase);
//        atr.forEach(a-> System.out.println(a));
//        Function<Float,PineApple> c1 = PineApple::new;
//        c1.apply(18f);
//        Consumer<String> consumer = PineApple::printWhatYouSet;
//        consumer.accept("WhatUWant");
//        BiFunction<Float,String,PineApple> f1 = PineApple::new;
//        f1.apply(18f,"uk");
//        //对Apple按照重量排序
//        Comparator<PineApple> c = Comparator.comparing(PineApple::getWeight);
//        //逆序 接口提供了一个reversed()方法
//        Comparator<PineApple> c11 = Comparator.comparing(PineApple::getWeight).reversed();
//        //比较器链
//        Comparator<PineApple> c12 = Comparator.comparing(PineApple::getWeight)
//                .reversed()
//                .thenComparing((a1, a2) -> {
//                    String country1 = a1.getCountry();
//                    String country2 = a2.getCountry();
//                    if (country1.equals("UK") && !country2.equals("UK")) {
//                        return -1;
//                    } else if (country1.equals("UK") && country2.equals("UK")) {
//                        return 0;
//                    } else {
//                        return 1;
//                    }
//                });
        PineApple pineApple1 = new PineApple(10f, "USA");
        PineApple pineApple2 = new PineApple(15f, "UK");
        PineApple pineApple3 = new PineApple(15f, "A");
        PineApple pineApple4 = new PineApple(15f, "Z");
        List<PineApple> list = new ArrayList<>();
        list.add(pineApple1);
        list.add(pineApple2);
        list.add(pineApple3);
        list.add(pineApple4);
//        list.sort(c12);
//        list.forEach(p -> System.out.println(p.toString()));
        PineApple[] pineApples = new PineApple[]{pineApple1,pineApple2,pineApple3,pineApple4};
        Arrays.sort(pineApples);
        Arrays.stream(pineApples).forEach(pineApple -> System.out.println(pineApple.toString()));
        Predicate<PineApple> redApple = (PineApple a) -> a.getCountry().equals("USA");
        redApple.test(pineApple1);
        Function<Integer,Integer> f = x-> x+1;
        Function<Integer,Integer> g = x -> x * 2;
        Function<Integer,Integer> h = f.andThen(g);
        System.out.println(h.apply(1));
    }
}
