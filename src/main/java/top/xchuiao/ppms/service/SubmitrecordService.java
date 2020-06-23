package top.xchuiao.ppms.service;

import top.xchuiao.ppms.entity.Submitrecord;
import java.util.List;

/**
 * (Submitrecord)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface SubmitrecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param subId 主键
     * @return 实例对象
     */
    Submitrecord queryById(Long subId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Submitrecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    Submitrecord insert(Submitrecord submitrecord);

    /**
     * 修改数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    Submitrecord update(Submitrecord submitrecord);

    /**
     * 通过主键删除数据
     *
     * @param subId 主键
     * @return 是否成功
     */
    boolean deleteById(Long subId);

    List<Submitrecord> queryByStaId(long id);

    List<Submitrecord> queryByDaudit(int i);
}