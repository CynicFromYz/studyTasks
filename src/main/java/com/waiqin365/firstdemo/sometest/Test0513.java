package com.waiqin365.firstdemo.sometest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/5/13 9:36
 */
public class Test0513 {

    public static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
//        ShopInfo shopInfo = new ShopInfo();
//        shopInfo.setShopId("10000");
//        Field field = shopInfo.getClass().getDeclaredField("shopId");
//        field.setAccessible(true);
//        field.set(shopInfo, "00001");
//        System.out.println(shopInfo.getShopId());
//        List<>
        Cat cat = new Cat();
//        scheduledExecutorService.schedule(new Runnable() {
//            @Override
//            public void run() {
//                cat.notifyAll();
//            }
//        }, 5, TimeUnit.SECONDS);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    synchronized (cat) {
                        cat.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println(System.currentTimeMillis());
        synchronized (cat) {
            cat.wait();
        }
        System.out.println(System.currentTimeMillis());
    }

    public void genericTest() {
        List<? extends Animal> list = new ArrayList<>();
        list.add(null);
//        list.add(new Object());
//        list.add(new Cat());
        Animal animal = list.get(0);


        List<? super Dog> dogList = new ArrayList<>();
//        catList.add(new Cat());
        dogList.add(new Dog());
        dogList.add(new BabyDog());
        Object obj = dogList.get(0);
        Dog dog = (Dog) obj;
//        Cat cat = catList.get(0);

    }

    private String getMe() {
        return "";
    }

    private int getMe(String c) {
        return 123;
    }

}
