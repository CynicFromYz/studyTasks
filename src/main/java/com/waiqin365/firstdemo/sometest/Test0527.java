package com.waiqin365.firstdemo.sometest;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/27 9:21
 */
public class Test0527 {
    public static void main(String[] args) {
        try {
            getAm();
        }catch (RuntimeException e){
            System.out.println("捕获运行时异常.");
        }

    }

    public static void getAm(){
        boolean rs = getFlag();
        if(!rs)
        {
            throw new RuntimeException();
        }
    }

    public static boolean getFlag(){
        return false;
    }


}
