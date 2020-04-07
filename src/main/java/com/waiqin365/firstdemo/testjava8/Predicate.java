package com.waiqin365.firstdemo.testjava8;

import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/26 14:17
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
