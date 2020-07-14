package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/5/12 19:52
 */
public class Test0512 {

    public static void main(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01==i02);
        System.out.println(i01==i03);
        System.out.println(i03==i04);
        System.out.println(i02==i04);
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("exception throw");
        }
    }
}
