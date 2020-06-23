package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.Project;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Project)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface ProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Project queryById(Long proId);

    List<Project> queryAllByProIds(List<Long> proIds);

    List<Project> queryAllByCliId(Long cliId);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Project> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param project 实例对象
     * @return 对象列表
     */
    List<Project> queryAll(Project project);

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 影响行数
     */
    int deleteById(Long proId);

}