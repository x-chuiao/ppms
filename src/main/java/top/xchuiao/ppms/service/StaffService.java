package top.xchuiao.ppms.service;

import top.xchuiao.ppms.entity.Staff;
import java.util.List;

/**
 * (Staff)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface StaffService {

    /**
     * 通过ID查询单条数据
     *
     * @param staId 主键
     * @return 实例对象
     */
    Staff queryById(Long staId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff update(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param staId 主键
     * @return 是否成功
     */
    boolean deleteById(Long staId);

    List<Staff> queryAllS();
}