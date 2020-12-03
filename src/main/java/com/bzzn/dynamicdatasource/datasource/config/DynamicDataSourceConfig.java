package com.bzzn.dynamicdatasource.datasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bzzn.dynamicdatasource.datasource.properties.DataSourceProperties;
import com.bzzn.dynamicdatasource.datasource.properties.DefaultDataSourceProperties;
import com.bzzn.dynamicdatasource.datasource.properties.DynamicDataSourceProperites;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ls
 * @date: 2020/12/2 18:59
 **/
@Configuration
public class DynamicDataSourceConfig {

   @Autowired
   private DynamicDataSourceProperites dynamicDataSourceProperites;

   @Autowired
   private DefaultDataSourceProperties defaultDataSourceProperties;

   @Bean
   public DynamicDataSource dynamicDataSource(){
       DynamicDataSource dynamicDataSource = new DynamicDataSource();
       DruidDataSource druidDataSource = new DruidDataSource();
       BeanUtils.copyProperties(defaultDataSourceProperties,druidDataSource);
       try {
           druidDataSource.init();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       dynamicDataSource.setDefaultTargetDataSource(druidDataSource);
       dynamicDataSource.setTargetDataSources(parseMap(dynamicDataSourceProperites.getDataSource()));
       return dynamicDataSource;
   }

   public Map<Object, Object> parseMap(Map<String, DataSourceProperties> dataSourcePropertiesMap){
       Map<Object, Object> targetMap = new HashMap<>();
       dataSourcePropertiesMap.entrySet().forEach(e ->{
           Object key = e.getKey();
           DruidDataSource druidDataSource = new DruidDataSource();
           BeanUtils.copyProperties(e.getValue(),druidDataSource);
           try {
               druidDataSource.init();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
           targetMap.put(key,druidDataSource);
       });
       return targetMap;
   }

}
