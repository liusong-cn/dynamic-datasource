package com.bzzn.dynamicdatasource.datasource.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: ls
 * @date: 2020/12/2 17:22
 **/
@ConfigurationProperties(prefix = "pg")
@Component
@Data
public class PGDataSourceProperties extends DataSourceProperties {

}
