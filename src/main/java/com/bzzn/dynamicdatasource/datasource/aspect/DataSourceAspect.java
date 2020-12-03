package com.bzzn.dynamicdatasource.datasource.aspect;

import com.bzzn.dynamicdatasource.config.DynamicContextHolder;
import com.bzzn.dynamicdatasource.datasource.annotation.DataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author: ls
 * @date: 2020/12/2 13:24
 **/
@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("@annotation(com.bzzn.dynamicdatasource.datasource.annotation.DataSource)")
    public void dataSourcePointCut(){

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Class targetClass = joinPoint.getTarget().getClass();
        Method method = methodSignature.getMethod();
        DataSource classDataSource = (DataSource) targetClass.getAnnotation(DataSource.class);
        DataSource methodDataSource = method.getDeclaredAnnotation(DataSource.class);
        if(classDataSource != null || methodDataSource != null){
            String value;
            //优先使用方法上注解
            if(methodDataSource != null){
                value = methodDataSource.value();
            }else {
                value = classDataSource.value();
            }
            DynamicContextHolder.setDataSource(value);
        }
        try {
            return joinPoint.proceed();
        } finally {
            //切点执行之后清除datasource
           DynamicContextHolder.clearDataSource();
        }
    }
}
