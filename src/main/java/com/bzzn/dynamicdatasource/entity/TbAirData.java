package com.bzzn.dynamicdatasource.entity;

import java.io.Serializable;

/**
 * (TbAirData)实体类
 *
 * @author makejava
 * @since 2020-12-03 11:10:43
 */
public class TbAirData implements Serializable {
    private static final long serialVersionUID = 890694736646569422L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 工地id
    */
    private String wsid;
    /**
    * 设备id
    */
    private String stationid;
    /**
    * 创建时间
    */
    private String createtime;
    /**
    * PM2.5（μg/m³）
    */
    private String pm25;
    /**
    * PM10（μg/m³）
    */
    private String pm10;
    /**
    * 大气温度（℃）
    */
    private String temperature;
    /**
    * 空气湿度（%RH）
    */
    private String humidity;
    /**
    * 风速（m/s）
    */
    private String windspeed;
    /**
    * 风向（°）
    */
    private String winddirection;
    /**
    * 二氧化氮（ug/m3）
    */
    private String no2;
    /**
    * 氮氧化物（μg/m³）
    */
    private String noc;
    /**
    * 大气压力
    */
    private String pressure;
    /**
    * 一氧化碳
    */
    private String co;
    /**
    * 臭氧
    */
    private String o3;
    /**
    * 三氧化硫
    */
    private String so3;
    /**
    * 二氧化硫
    */
    private String so2;
    /**
    * api
    */
    private String aqi;
    /**
    * primaryPollutants
    */
    private String primaryPollutants;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getSo3() {
        return so3;
    }

    public void setSo3(String so3) {
        this.so3 = so3;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getPrimaryPollutants() {
        return primaryPollutants;
    }

    public void setPrimaryPollutants(String primaryPollutants) {
        this.primaryPollutants = primaryPollutants;
    }

}