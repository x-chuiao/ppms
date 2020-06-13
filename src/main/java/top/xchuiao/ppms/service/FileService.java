package top.xchuiao.ppms.service;

import top.xchuiao.ppms.entity.File;
import java.util.List;

/**
 * (File)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface FileService {

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    File queryById(Long fileId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<File> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    File insert(File file);

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    File update(File file);

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 是否成功
     */
    boolean deleteById(Long fileId);

}