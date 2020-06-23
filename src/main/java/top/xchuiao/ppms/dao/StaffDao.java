package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.Staff;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Staff)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface StaffDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staId 主键
     * @return 实例对象
     */
    Staff queryById(Long staId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param staff 实例对象
     * @return 对象列表
     */
    List<Staff> queryAll(Staff staff);
    List<Staff> queryAllS();
    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int update(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param staId 主键
     * @return 影响行数
     */
    int deleteById(Long staId);

}