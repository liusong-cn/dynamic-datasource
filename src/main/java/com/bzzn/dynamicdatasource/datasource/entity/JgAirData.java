package com.bzzn.dynamicdatasource.datasource.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * jg_air_data
 * @author 
 */
@Data
public class JgAirData implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 臭氧
     */
    private String o3;

    /**
     * 一氧化碳
     */
    private String co;

    /**
     * 二氧化氮
     */
    private String no2;

    /**
     * 二氧化硫
     */
    private String so2;

    /**
     * AQI
     */
    private String aqi;

    /**
     * 风向
     */
    private String wd;

    /**
     * 风速
     */
    private String ws;

    /**
     * PM10
     */
    private String pm10;

    /**
     * PM25
     */
    private String pm25;

    /**
     * RH
     */
    private String rh;

    /**
     * TEMP
     */
    private String temp;

    /**
     * 站点
     */
    private String stationcode;

    /**
     * 地点
     */
    private String pointname;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * TVOC
     */
    private String tvoc;

    /**
     * yyyyMMddhhss时间
     */
    private Date time;

    private static final long serialVersionUID = 1L;
}