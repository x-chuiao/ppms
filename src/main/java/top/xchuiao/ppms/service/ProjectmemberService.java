package top.xchuiao.ppms.service;

import top.xchuiao.ppms.entity.Projectmember;
import java.util.List;
import java.util.Map;

/**
 * (Projectmember)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface ProjectmemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Projectmember queryById(Long proId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectmember> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    Projectmember insert(Projectmember projectmember);

    /**
     * 修改数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    Projectmember update(Projectmember projectmember);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    boolean deleteById(Long proId);

    List<Projectmember> queryAll(Projectmember projectmember);

    List<Projectmember> queryAllPmember(long id);

    //通过depId查询proid,staId,staName
    List<Map<String,Object>> queryAllByDepId(Long depId);
}