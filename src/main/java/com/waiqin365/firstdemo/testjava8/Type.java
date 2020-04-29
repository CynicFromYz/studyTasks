package com.waiqin365.firstdemo.testjava8;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/7 20:28
 */
public enum Type {
    MEAT("1"),
    OTHER("2"),
    FISH("3");

    Type(String val)
    {
        this.val = val;
    }
    String  val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
