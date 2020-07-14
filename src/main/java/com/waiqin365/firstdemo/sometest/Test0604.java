package com.waiqin365.firstdemo.sometest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/6/4 15:29
 */
public class Test0604 {

    private static final Logger logger = LoggerFactory.getLogger(Test0604.class);

    public static void main(String[] args) {
        try {
            getRes();
        }catch (Exception e){
            logger.error("异常:{}",e.getMessage());
        }
    }


    public static String getRes(){
        String a = null;
        System.out.println(a.split(","));
        return "";
    }

}
