package com.bzzn.dynamicdatasource.config.mapper;

import com.bzzn.dynamicdatasource.datasource.entity.JgAirData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ls
 * @date: 2020/12/3 10:41
 **/
@Mapper
public interface AirDataMapper {

    String getById(@Param("id") long id);

    String getByO3(@Param("O3") String O3);
}
