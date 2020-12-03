//package com.bzzn.dynamicdatasource.service;
//
//import com.bzzn.dynamicdatasource.config.mapper.AirDataMapper;
//import com.bzzn.dynamicdatasource.datasource.dao.JgAirDataDao;
//import com.bzzn.dynamicdatasource.datasource.entity.JgAirData;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
///**
// * @author: ls
// * @date: 2020/12/3 9:53
// **/
//@Service
//public class AirService {
//
//    @Resource
//    private JgAirDataDao airDataDao;
//
//    @Resource
//    private AirDataMapper airDataMapper;
//
//    public void getById(String O3){
//        String airData = airDataMapper.getByO3(O3);
//    }
//}
