package top.xchuiao.ppms.dao;

import top.xchuiao.ppms.entity.Client;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Client)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface ClientDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cliId 主键
     * @return 实例对象
     */
    Client queryById(Long cliId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Client> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param client 实例对象
     * @return 对象列表
     */
    List<Client> queryAll(Client client);

    /**
     * 新增数据
     *
     * @param client 实例对象
     * @return 影响行数
     */
    int insert(Client client);

    /**
     * 修改数据
     *
     * @param client 实例对象
     * @return 影响行数
     */
    int update(Client client);

    /**
     * 通过主键删除数据
     *
     * @param cliId 主键
     * @return 影响行数
     */
    int deleteById(Long cliId);

    List<Client> queryAll();

    public Client queryByAccId(Long accId);
}