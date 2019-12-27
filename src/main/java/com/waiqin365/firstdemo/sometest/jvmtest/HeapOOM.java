package com.waiqin365.firstdemo.sometest.jvmtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/20 9:27
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
