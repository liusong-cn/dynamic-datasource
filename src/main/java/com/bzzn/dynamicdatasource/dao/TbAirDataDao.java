package com.bzzn.dynamicdatasource.dao;

import com.bzzn.dynamicdatasource.entity.TbAirData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbAirData)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-03 11:10:43
 */
@Mapper
public interface TbAirDataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbAirData queryById(@Param("id") Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbAirData> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbAirData 实例对象
     * @return 对象列表
     */
    List<TbAirData> queryAll(TbAirData tbAirData);

    /**
     * 新增数据
     *
     * @param tbAirData 实例对象
     * @return 影响行数
     */
    int insert(TbAirData tbAirData);

    /**
     * 修改数据
     *
     * @param tbAirData 实例对象
     * @return 影响行数
     */
    int update(TbAirData tbAirData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}