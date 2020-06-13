package top.xchuiao.ppms.service.impl;

import top.xchuiao.ppms.entity.Position;
import top.xchuiao.ppms.dao.PositionDao;
import top.xchuiao.ppms.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Position)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionDao positionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param posId 主键
     * @return 实例对象
     */
    @Override
    public Position queryById(Integer posId) {
        return this.positionDao.queryById(posId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Position> queryAllByLimit(int offset, int limit) {
        return this.positionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param position 实例对象
     * @return 实例对象
     */
    @Override
    public Position insert(Position position) {
        this.positionDao.insert(position);
        return position;
    }

    /**
     * 修改数据
     *
     * @param position 实例对象
     * @return 实例对象
     */
    @Override
    public Position update(Position position) {
        this.positionDao.update(position);
        return this.queryById(position.getPosId());
    }

    /**
     * 通过主键删除数据
     *
     * @param posId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer posId) {
        return this.positionDao.deleteById(posId) > 0;
    }
}