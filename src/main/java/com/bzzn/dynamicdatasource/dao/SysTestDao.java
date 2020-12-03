package com.bzzn.dynamicdatasource.dao;

import com.bzzn.dynamicdatasource.entity.SysTest;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysTest)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-03 13:52:03
 */
public interface SysTestDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTest queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysTest> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysTest 实例对象
     * @return 对象列表
     */
    List<SysTest> queryAll(SysTest sysTest);

    /**
     * 新增数据
     *
     * @param sysTest 实例对象
     * @return 影响行数
     */
    int insert(SysTest sysTest);

    /**
     * 修改数据
     *
     * @param sysTest 实例对象
     * @return 影响行数
     */
    int update(SysTest sysTest);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}