package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.Submitrecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Submitrecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface SubmitrecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param subId 主键
     * @return 实例对象
     */
    Submitrecord queryById(Long subId);
    List<Submitrecord> queryByStaId(long id);
    List<Submitrecord> queryByDaudit(int i);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Submitrecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param submitrecord 实例对象
     * @return 对象列表
     */
    List<Submitrecord> queryAll(Submitrecord submitrecord);

    /**
     * 新增数据
     *
     * @param submitrecord 实例对象
     * @return 影响行数
     */
    int insert(Submitrecord submitrecord);

    /**
     * 修改数据
     *
     * @param submitrecord 实例对象
     * @return 影响行数
     */
    int update(Submitrecord submitrecord);

    /**
     * 通过主键删除数据
     *
     * @param subId 主键
     * @return 影响行数
     */
    int deleteById(Long subId);

}