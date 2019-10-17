package com.waiqin365.firstdemo.sometest;

import com.waiqin365.firstdemo.domain.Message;

public class Single3Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SingletonBean singletonBean = (SingletonBean) Class.forName("com.waiqin365.firstdemo.sometest.SingletonBean").newInstance();
        singletonBean.setAcs("123");
        System.out.println(singletonBean);
    }
}
