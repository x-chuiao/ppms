package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.File;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (File)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface FileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    File queryById(Long fileId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<File> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);




    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 影响行数
     */
    int insert(File file);

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 影响行数
     */
    int update(File file);

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 影响行数
     */
    int deleteById(Long fileId);

    List<File> queryAllPfile(long fileId);
}