package com.bzzn.dynamicdatasource.config;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author: ls
 * @date: 2020/12/2 11:49
 * 数据源上下文管理器
 **/
public class DynamicContextHolder {

    private static ThreadLocal<Deque<String>> CONTEXT_HOLDER = new ThreadLocal(){

        @Override
        protected Object initialValue(){
            return new ArrayDeque<>();
        }
    };

    public static void setDataSource(String dataSource){
        CONTEXT_HOLDER.get().push(dataSource);
    }

    public static String getDataSource(){
        return CONTEXT_HOLDER.get().peek();
    }

    public static void clearDataSource(){
        Deque<String> deque = CONTEXT_HOLDER.get();
        deque.poll();
        if(deque.isEmpty())
            CONTEXT_HOLDER.remove();
    }
}
