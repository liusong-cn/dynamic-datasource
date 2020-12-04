package com.bzzn.dynamicdatasource.service;

import com.bzzn.dynamicdatasource.entity.SysTest;
import java.util.List;

/**
 * (SysTest)表服务接口
 *
 * @author makejava
 * @since 2020-12-03 13:52:03
 */
public interface SysTestService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTest queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysTest> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysTest 实例对象
     * @return 实例对象
     */
    SysTest insert(SysTest sysTest);

    /**
     * 修改数据
     *
     * @param sysTest 实例对象
     * @return 实例对象
     */
    SysTest update(SysTest sysTest);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    void methodArgs(String arg1, String arg2);

}