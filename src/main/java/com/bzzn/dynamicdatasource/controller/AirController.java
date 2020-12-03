//package com.bzzn.dynamicdatasource.controller;
//
//import com.bzzn.dynamicdatasource.service.AirService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author: ls
// * @date: 2020/12/3 10:10
// **/
//@RestController
//@RequestMapping("/airdata")
//public class AirController {
//
//    @Autowired
//    private AirService airService;
//
//    @GetMapping("/{O3}")
//    public void getList(@PathVariable(value = "O3") String O3){
//        airService.getById(O3);
//    }
//}
