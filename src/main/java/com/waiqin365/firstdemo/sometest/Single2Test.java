package com.waiqin365.firstdemo.sometest;

public class Single2Test {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            try {
                System.out.println(i);
                int b = 3/0;
                break;
            } catch (Exception e) {
                System.out.println("ignore this exception~");
            }
            i++;
        }
    }
}
