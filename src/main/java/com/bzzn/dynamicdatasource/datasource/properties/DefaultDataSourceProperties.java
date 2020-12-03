package com.bzzn.dynamicdatasource.datasource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: ls
 * @date: 2020/12/2 20:06
 **/
@ConfigurationProperties(prefix = "spring.datasource")
@Component
public class DefaultDataSourceProperties extends DataSourceProperties {
}
