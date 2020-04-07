package com.waiqin365.firstdemo.testjava8;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/26 14:18
 */
public abstract class PineApplePredicate implements Predicate<PineApple> {
    @Override
    public boolean test(PineApple pineApple) {
        handle();
        return pineApple.getCountry().equals("china") ? true : false;
    }

    public abstract void handle();
}
