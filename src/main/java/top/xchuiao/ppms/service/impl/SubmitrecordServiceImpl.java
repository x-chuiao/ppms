package top.xchuiao.ppms.service.impl;

import top.xchuiao.ppms.entity.Submitrecord;
import top.xchuiao.ppms.dao.SubmitrecordDao;
import top.xchuiao.ppms.service.SubmitrecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Submitrecord)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
@Service("submitrecordService")
public class SubmitrecordServiceImpl implements SubmitrecordService {
    @Resource
    private SubmitrecordDao submitrecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param subId 主键
     * @return 实例对象
     */
    @Override
    public Submitrecord queryById(Long subId) {
        return this.submitrecordDao.queryById(subId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Submitrecord> queryAllByLimit(int offset, int limit) {
        return this.submitrecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Submitrecord insert(Submitrecord submitrecord) {
        this.submitrecordDao.insert(submitrecord);
        return submitrecord;
    }

    /**
     * 修改数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Submitrecord update(Submitrecord submitrecord) {
        this.submitrecordDao.update(submitrecord);
        return this.queryById(submitrecord.getSubId());
    }

    /**
     * 通过主键删除数据
     *
     * @param subId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long subId) {
        return this.submitrecordDao.deleteById(subId) > 0;
    }

    @Override
    public List<Submitrecord> queryByStaId(long id) {
        return this.submitrecordDao.queryByStaId(id);
    }

    @Override
    public List<Submitrecord> queryByDaudit(int i) {
        return this.submitrecordDao.queryByDaudit(i);
    }
}