package com.waiqin365.firstdemo.testjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/7 10:11
 */
public class Test0407 {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);
        Integer reduce = nums1.stream().reduce(0, Integer::sum);
        Optional<Integer> reduce1 = nums1.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());
        Optional<Integer> max = nums1.stream().reduce(Integer::max);
        if(!max.isPresent()){
            System.out.println("=========optionalIsNull===============");
        }
        System.out.println(max.get());
        double sum = nums1.stream().mapToInt(Integer::intValue).average().orElse(18d);
        System.out.println(sum);
        IntStream evenNumbers = IntStream.rangeClosed(1,100).filter(i->i%2==0);
        System.out.println(evenNumbers.count());//50
        Stream<double[]> stream1 = IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(
                                b -> new double[]{a, b, Math.sqrt(a * a + b * b)}
                        ).filter(t -> t[2] % 1 == 0));
        stream1.limit(3).forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));
        Stream.iterate(0,n->n+2)
                .limit(10)
                .forEach(System.out::println);
    }
}
