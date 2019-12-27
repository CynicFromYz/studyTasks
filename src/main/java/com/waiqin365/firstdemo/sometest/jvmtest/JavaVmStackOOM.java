package com.waiqin365.firstdemo.sometest.jvmtest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/22 10:31
 */
public class JavaVmStackOOM {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable{
        JavaVmStackOOM javaVmStackOOM = new JavaVmStackOOM();
        javaVmStackOOM.stackLeakByThread();
    }
}
