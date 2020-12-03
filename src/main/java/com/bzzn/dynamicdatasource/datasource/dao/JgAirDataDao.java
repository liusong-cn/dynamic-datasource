package com.bzzn.dynamicdatasource.datasource.dao;

import com.bzzn.dynamicdatasource.datasource.entity.JgAirData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface JgAirDataDao {
    int deleteByPrimaryKey(Long id);

    int insert(JgAirData record);

    int insertSelective(JgAirData record);

    JgAirData selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(JgAirData record);

    int updateByPrimaryKey(JgAirData record);
}