package com.waiqin365.firstdemo.sometest;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/12 14:39
 */
public class LazySingleton implements Serializable {

    private static final long serialVersionUID = -102695448643740828L;

    private static volatile LazySingleton lazySingleton = null;


    public LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("禁止反射实例化");
        }
    }

    public LazySingleton getLazySingletonInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    /**
     * readResolve方法的作用为防止序列化单例时破坏唯一实例的规则
     */
    private Object readResolve() throws ObjectStreamException {
        return lazySingleton;
    }

}
