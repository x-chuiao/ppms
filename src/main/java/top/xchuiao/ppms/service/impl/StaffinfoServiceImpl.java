package top.xchuiao.ppms.service.impl;

import top.xchuiao.ppms.entity.Staffinfo;
import top.xchuiao.ppms.dao.StaffinfoDao;
import top.xchuiao.ppms.service.StaffinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Staffinfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
@Service("staffinfoService")
public class StaffinfoServiceImpl implements StaffinfoService {
    @Resource
    private StaffinfoDao staffinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Staffinfo queryById( ) {
        return this.staffinfoDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Staffinfo> queryAllByLimit(int offset, int limit) {
        return this.staffinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param staffinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Staffinfo insert(Staffinfo staffinfo) {
        this.staffinfoDao.insert(staffinfo);
        return staffinfo;
    }

    /**
     * 修改数据
     *
     * @param staffinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Staffinfo update(Staffinfo staffinfo) {
        this.staffinfoDao.update(staffinfo);
        return this.queryById(staffinfo.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.staffinfoDao.deleteById() > 0;
    }
}