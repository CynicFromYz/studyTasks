package com.waiqin365.firstdemo.sometest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Description:
 * date: 2019/10/15 19:42
 *
 * @author cynic
 * @version 1.0
 */
public class Single6Test {
    static List<Student> list = new ArrayList<>();

    static {
        Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        list.add(stuA);
        list.add(stuB);
        list.add(stuC);
        list.add(stuD);
        list.add(stuE);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Integer integer  = new Integer(0);
//
//        List<Integer> list = new ArrayList<>();//基本类型不能用作泛型
//
//        Integer integer1 = new Integer(4);
//        Integer integer2 = new Integer(4);
//        System.out.println(integer1==integer2);
//        FanXingTest fanXingTest = new FanXingTest();
//        fanXingTest.setName("123");
//        System.out.println(fanXingTest.getName());
//        Class clazz = fanXingTest.getClass();
//        Object o = clazz.newInstance();
//        Method methodSetName = clazz.getDeclaredMethod("setName", String.class);
//        Method methodGetName = clazz.getDeclaredMethod("getName");
//        methodSetName.invoke(o,"jack_ma");
//        String name = (String) methodGetName.invoke(o);
//        System.out.println(name);
//        OnClickListener mListener = () -> {
//            System.out.println("do on Click 1");
//            System.out.println("do on Click 2");
//        };
//        mListener.doOnClick();
//        String a = "123";
//        OnItemClickListener onItemClickListener = (position1234) -> position1234 * 5;
//        System.out.println(onItemClickListener.doItemClickListener(123));
//        IMathListener mPlusListener = Math::doIntPlus;
//        System.out.println(mPlusListener.doMathOperator(1,2));
//        Iterator<Student> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            Student stu = iterator.next();
//            if (stu.getSex().equals("G")) {
//
//                System.out.println(stu.toString());
//            }
//        }
//        Long a = list.parallelStream()
//                .filter(student -> {
//                    System.out.println(student.getHeight());
//                    return student.getName().equals("A");
//                })
//                .count();
//        System.out.println(a);
//
//        list.stream().filter(student -> "A".equals(student.getName())).count();
//        Stream<Student> stream = Stream.of(list.get(0), list.get(1), list.get(2));
//        long count = stream.filter(student -> "A".equals(student.getName())).count();
//        System.out.println(count);
//        Stream<Double> generateB = Stream.generate(() -> {
//            Double doubleVal = java.lang.Math.random();
//            return doubleVal;
//        });
//        List<Double> doubles = new ArrayList<>();
//        generateB.limit(2).forEach(num -> doubles.add(num));
//        doubles.stream().forEach(num2 -> System.out.println(num2));
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5)
//                .skip(2);
//        stream.forEach(num -> System.out.println(num));
//        list.sort(Student::compareTo);
//        list.stream().forEach(student -> System.out.println(student.getHeight()));
       list.sort(new StudentComparator());

    }

}
