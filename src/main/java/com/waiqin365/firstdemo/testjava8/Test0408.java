package com.waiqin365.firstdemo.testjava8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/8 8:54
 */
public class Test0408 {
    public static final List<Dish> menu = Arrays.asList(
            new Dish("猪肉炖粉条", false, 800, Type.MEAT),
            new Dish("小炒牛肉", false, 700, Type.MEAT),
            new Dish("宫保鸡丁", false, 400, Type.MEAT),
            new Dish("地三鲜", true, 530, Type.OTHER),
            new Dish("水煮菠菜", true, 350, Type.OTHER),
            new Dish("拔丝地瓜", true, 120, Type.OTHER),
            new Dish("火山下雪", true, 550, Type.OTHER),
            new Dish("水煮鱼", false, 330, Type.FISH),
            new Dish("于是乎", false, 450, Type.FISH)
    );

    public static void main(String[] args) {
//        //按照类型分组 java 7
//        Map<Type, List<Dish>> dishesByTypes = new HashMap<>();
//        for (Dish dish : menu) {
//            Type type = dish.getType();
//            List<Dish> dishForType = dishesByTypes.get(type);
//            if (dishForType == null) {
//                dishForType = new ArrayList<>();
//                dishesByTypes.put(type, dishForType);
//            }
//            dishForType.add(dish);
//        }
//        System.out.println("=============1=========");
//        Map<Type,List<Dish>> dishes = menu.stream().collect(groupingBy(Dish::getType));
//        System.out.println("=============2=========");
//        String names1 = menu.stream().map(Dish::getName).collect(joining(","));
//        System.out.println(names1);
//        String[] strings = new String[]{"1","2","3","4"};
//        String c = Arrays.stream(strings).collect(Collectors.joining(","));
//        System.out.println(c);
//        IntSummaryStatistics menuStatics = menu.stream().collect(summarizingInt(Dish::getWeight));
//        System.out.println(menuStatics.getCount());
//        System.out.println(menuStatics.getMax());
//        System.out.println(menuStatics.getMin());
//        System.out.println(menuStatics.getSum());
//        System.out.println(menuStatics.getAverage());
//        int sum = menu.stream().mapToInt(Dish::getWeight).sum();
//        System.out.println(sum);
//        Map<Type, Optional<Dish>> group4 = menu.stream().collect(groupingBy(Dish::getType, maxBy(Comparator.comparing(Dish::getWeight))));
//        Map<Type, Dish> group5 = menu.stream().collect(groupingBy(Dish::getType,
//                collectingAndThen(
//                        maxBy(Comparator.comparing(Dish::getWeight)), Optional::get)));
//        Map<Type, Set<String>> group7 = menu.stream().collect(groupingBy(Dish::getType,
//                mapping(w -> {
//                    if (w.getWeight() > 700) {
//                        return "super higt";
//                    } else {
//                        return "super low";
//                    }
//                }, toSet())
//        ));
//        long millisBefore = System.nanoTime();//new Date().getTime();
//        getSumOldJava(10000000L);
//        System.out.println((System.nanoTime()-millisBefore)/1_000_000);
        long millisBefore1 = System.nanoTime();//new Date().getTime();
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = GetRangeClosedSumParallel(10000000);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + duration);
            if (duration < fastest) fastest = duration;
        }
        System.out.println(fastest);
        System.out.println((System.nanoTime()-millisBefore1)/1_000_000);
//        long millisBefore2 = System.nanoTime();//new Date().getTime();
//        getSum(10000000L);
//        System.out.println((System.nanoTime()-millisBefore2)/1_000_000);
//        long millisBefore3 = System.nanoTime();//new Date().getTime();
//        getSumParallel(10000000L);
//        System.out.println((System.nanoTime()-millisBefore3)/1_000_000);
    }

    public static long GetRangeClosedSumParallel(long n){
        return LongStream.rangeClosed(1L,n).parallel().reduce(0L,Long::sum);
    }

    public static long getSumOldJava(long n){
        long sum = 0;
        for(int i = 0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    //iterate
    public static long getSum(long n){
        return Stream.iterate(1L, i->i+1).limit(n).reduce(0L,Long::sum);
    }
    //iterate Parallel
    public static long getSumParallel(long n){
        return Stream.iterate(1L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);
    }

}
