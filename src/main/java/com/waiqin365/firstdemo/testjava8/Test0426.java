package com.waiqin365.firstdemo.testjava8;

import java.io.File;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/26 16:45
 */
public class Test0426 {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);

    }
}
