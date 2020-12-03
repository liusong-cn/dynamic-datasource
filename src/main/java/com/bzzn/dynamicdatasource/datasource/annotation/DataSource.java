package com.bzzn.dynamicdatasource.datasource.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: ls
 * @date: 2020/12/2 11:23
 **/
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Target(value = {ElementType.METHOD,ElementType.TYPE})
public @interface DataSource {

    //定义数据库类型
    String value() default "";
}
