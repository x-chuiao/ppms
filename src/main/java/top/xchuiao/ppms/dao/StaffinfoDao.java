package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.Staffinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Staffinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface StaffinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @param accId
     * @return 实例对象
     */
    Staffinfo queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staffinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param staffinfo 实例对象
     * @return 对象列表
     */
    List<Staffinfo> queryAll(Staffinfo staffinfo);

    /**
     * 新增数据
     *
     * @param staffinfo 实例对象
     * @return 影响行数
     */
    int insert(Staffinfo staffinfo);

    /**
     * 修改数据
     *
     * @param staffinfo 实例对象
     * @return 影响行数
     */
    int update(Staffinfo staffinfo);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById(Long depId );

    Staffinfo queryByAccId(long accId);
}