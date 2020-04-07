package com.waiqin365.firstdemo.testjava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/26 13:45
 */
public class Test0326 {
    private static List<PineApple> list = new ArrayList<>();

    static {
        list.add(new PineApple(5.0f, "china"));
        list.add(new PineApple(15.0f, "england"));
        list.add(new PineApple(12.0f, "usa"));
    }

    public static void main(String[] args) {
        list.sort(Comparator.comparing(PineApple::getWeight));
        list.forEach(pineApple -> System.out.println(pineApple.toString()));
        System.out.println("====================================");
        List<PineApple> listNew = FilterGenericTest.filterList(list, new PineApplePredicate() {
            @Override
            public void handle() {
                System.out.println("override method handle!");
            }
        });
        List<PineApple> listNewAlia = FilterGenericTest.filterList(list, pineApple -> false);
        listNew.forEach(pineApple -> System.out.println(pineApple.toString()));
        new Thread(() -> {
        }).start();
        //无参构造函数
        Supplier<PineApple> p1 = PineApple::new;
        //调用Supplier的get方法产生一个新的Apple
        PineApple a1 = p1.get();
        PineApple a2 = p1.get();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }


}
