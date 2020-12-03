package com.bzzn.dynamicdatasource.controller;

import com.bzzn.dynamicdatasource.entity.SysTest;
import com.bzzn.dynamicdatasource.service.SysTestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysTest)表控制层
 *
 * @author makejava
 * @since 2020-12-03 13:52:03
 */
@RestController
@RequestMapping("/sysTest")
public class SysTestController {
    /**
     * 服务对象
     */
    @Resource
    private SysTestService sysTestService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysTest selectOne(Integer id) {
        return this.sysTestService.queryById(id);
    }

}