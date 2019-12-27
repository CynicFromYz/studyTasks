package com.waiqin365.firstdemo.sometest.jvmtest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/22 10:07
 */
public class JavaVmStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVmStackSOF oom = new JavaVmStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }
}
