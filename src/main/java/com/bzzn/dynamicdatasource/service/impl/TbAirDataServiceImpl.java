package com.bzzn.dynamicdatasource.service.impl;

import com.bzzn.dynamicdatasource.datasource.annotation.DataSource;
import com.bzzn.dynamicdatasource.entity.TbAirData;
import com.bzzn.dynamicdatasource.dao.TbAirDataDao;
import com.bzzn.dynamicdatasource.service.TbAirDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAirData)表服务实现类
 *
 * @author makejava
 * @since 2020-12-03 11:10:47
 */
@Service("tbAirDataService")
public class TbAirDataServiceImpl implements TbAirDataService {
    @Resource
    private TbAirDataDao tbAirDataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    @DataSource("mysql")
    public TbAirData queryById(Integer id) {
        return this.tbAirDataDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbAirData> queryAllByLimit(int offset, int limit) {
        return this.tbAirDataDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbAirData 实例对象
     * @return 实例对象
     */
    @Override
    public TbAirData insert(TbAirData tbAirData) {
        this.tbAirDataDao.insert(tbAirData);
        return tbAirData;
    }

    /**
     * 修改数据
     *
     * @param tbAirData 实例对象
     * @return 实例对象
     */
    @Override
    public TbAirData update(TbAirData tbAirData) {
        this.tbAirDataDao.update(tbAirData);
        return this.queryById(tbAirData.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbAirDataDao.deleteById(id) > 0;
    }
}