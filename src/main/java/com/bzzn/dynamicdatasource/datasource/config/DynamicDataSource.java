package com.bzzn.dynamicdatasource.datasource.config;

import com.bzzn.dynamicdatasource.config.DynamicContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author: ls
 * @date: 2020/12/2 17:06
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {



    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicContextHolder.getDataSource();
    }
}
