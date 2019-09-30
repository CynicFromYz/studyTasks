package com.waiqin365.firstdemo.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyLog {

    String requestUrl() default "默认参数/";

}
