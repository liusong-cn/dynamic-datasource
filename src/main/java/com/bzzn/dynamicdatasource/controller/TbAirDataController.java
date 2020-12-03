package com.bzzn.dynamicdatasource.controller;

import com.bzzn.dynamicdatasource.entity.TbAirData;
import com.bzzn.dynamicdatasource.service.TbAirDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAirData)表控制层
 *
 * @author makejava
 * @since 2020-12-03 11:10:50
 */
@RestController
@RequestMapping("/tbAirData")
public class TbAirDataController {
    /**
     * 服务对象
     */
    @Resource
    private TbAirDataService tbAirDataService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public TbAirData selectOne(@RequestParam(name = "id") Integer id) {
        return this.tbAirDataService.queryById(id);
    }

    @GetMapping("/queryAll")
    public List<TbAirData> queryAll(@RequestParam(name = "limit") int limit,
                                    @RequestParam(name = "offset") int offset){
        return tbAirDataService.queryAllByLimit(offset,limit);
    };

}