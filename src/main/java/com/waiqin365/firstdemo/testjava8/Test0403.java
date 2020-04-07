package com.waiqin365.firstdemo.testjava8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/3 16:26
 */
public class Test0403 {
    public static void main(String[] args) {
//        List<PineApple> list = new ArrayList<>();
//        PineApple pineApple1 = new PineApple(190f);
//        PineApple pineApple2 = new PineApple(190f);
//        list.add(pineApple1);
//        list.add(pineApple1);
//        list.add(pineApple2);
//        list.stream().distinct().forEach(pineAppleAlias -> System.out.println(pineAppleAlias.toString()));

//        String[] words = {"hello", "world"};
//        List<String> collect2 = Arrays.stream(words)
//                .map(w -> w.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(toList());
//        collect2.forEach(c-> System.out.println(c));
        List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5);

        List<int[]> collect4 = num1.stream()
                .flatMap(i -> num2.stream().map(j -> new int[]{i, j}))
                .collect(toList());
        collect4.forEach(c-> System.out.println(c[0]+"-"+c[1]));
        System.out.println(collect4.size());
        if(num1.stream().anyMatch(s->s==1)){
            System.out.println("=========1equals1===========");
        }
    }
}
