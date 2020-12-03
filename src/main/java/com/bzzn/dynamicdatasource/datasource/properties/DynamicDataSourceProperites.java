package com.bzzn.dynamicdatasource.datasource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ls
 * @date: 2020/12/2 19:29
 **/
@ConfigurationProperties(prefix = "dynamic")
@Component
public class DynamicDataSourceProperites {

    private Map<String, DataSourceProperties> dataSource = new HashMap<>();

    public void setDataSource(Map<String, DataSourceProperties> dataSource){
        this.dataSource = dataSource;
    }

    public Map<String, DataSourceProperties> getDataSource(){
        return dataSource;
    }
}
