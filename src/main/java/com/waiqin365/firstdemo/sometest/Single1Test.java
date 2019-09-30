package com.waiqin365.firstdemo.sometest;

import com.waiqin365.firstdemo.domain.Message;

public class Single1Test {
    public static void main(String[] args) {
        try {
            Message message = (Message) Class.forName("com.waiqin365.firstdemo.domain.Message").newInstance();
            message.setId(123L);
            System.out.println(message.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
