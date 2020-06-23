package top.xchuiao.ppms.service.impl;

import top.xchuiao.ppms.entity.Projectmember;
import top.xchuiao.ppms.dao.ProjectmemberDao;
import top.xchuiao.ppms.service.ProjectmemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Projectmember)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
@Service("projectmemberService")
public class ProjectmemberServiceImpl implements ProjectmemberService {
    @Resource
    private ProjectmemberDao projectmemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    @Override
    public Projectmember queryById(Long proId) {
        return this.projectmemberDao.queryById(proId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Projectmember> queryAllByLimit(int offset, int limit) {
        return this.projectmemberDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    @Override
    public Projectmember insert(Projectmember projectmember) {
        this.projectmemberDao.insert(projectmember);
        return projectmember;
    }

    /**
     * 修改数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    @Override
    public Projectmember update(Projectmember projectmember) {
        this.projectmemberDao.update(projectmember);
        return this.queryById(projectmember.getProId());
    }

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long proId) {
        return this.projectmemberDao.deleteById(proId) > 0;
    }

    @Override
    public List<Projectmember> queryAll(Projectmember projectmember) {
        return this.projectmemberDao.queryAll(projectmember);
    }

    @Override
    public List<Projectmember> queryAllPmember(long id) {
        return this.projectmemberDao.queryAllPmember(id);
    }

    @Override
    public List<Map<String,Object>> queryAllByDepId(Long depId) {
        return this.projectmemberDao.queryAllByDepId(depId);
    }
}