package com.waiqin365.firstdemo.testjava8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/26 14:22
 */
public class FilterGenericTest {
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List resList = new ArrayList();
        list.stream().filter(t -> predicate.test(t)).forEach(t -> resList.add(t));
        return resList;
    }
}
