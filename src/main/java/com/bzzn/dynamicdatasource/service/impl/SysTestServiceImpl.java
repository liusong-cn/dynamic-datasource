package com.bzzn.dynamicdatasource.service.impl;

import com.bzzn.dynamicdatasource.datasource.annotation.DataSource;
import com.bzzn.dynamicdatasource.entity.SysTest;
import com.bzzn.dynamicdatasource.dao.SysTestDao;
import com.bzzn.dynamicdatasource.service.SysTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysTest)表服务实现类
 *
 * @author makejava
 * @since 2020-12-03 13:52:03
 */
@Service("sysTestService")
public class SysTestServiceImpl implements SysTestService {
    @Resource
    private SysTestDao sysTestDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    @DataSource("pg")
    public SysTest queryById(Integer id) {
        return this.sysTestDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysTest> queryAllByLimit(int offset, int limit) {
        return this.sysTestDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysTest 实例对象
     * @return 实例对象
     */
    @Override
    public SysTest insert(SysTest sysTest) {
        this.sysTestDao.insert(sysTest);
        return sysTest;
    }

    /**
     * 修改数据
     *
     * @param sysTest 实例对象
     * @return 实例对象
     */
    @Override
    public SysTest update(SysTest sysTest) {
        this.sysTestDao.update(sysTest);
        return this.queryById(sysTest.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysTestDao.deleteById(id) > 0;
    }
}