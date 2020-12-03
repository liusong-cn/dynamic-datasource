package com.bzzn.dynamicdatasource.service;

import com.bzzn.dynamicdatasource.entity.TbAirData;
import java.util.List;

/**
 * (TbAirData)表服务接口
 *
 * @author makejava
 * @since 2020-12-03 11:10:47
 */
public interface TbAirDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbAirData queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbAirData> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbAirData 实例对象
     * @return 实例对象
     */
    TbAirData insert(TbAirData tbAirData);

    /**
     * 修改数据
     *
     * @param tbAirData 实例对象
     * @return 实例对象
     */
    TbAirData update(TbAirData tbAirData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}