package top.xchuiao.ppms.service;

import sun.rmi.runtime.Log;
import top.xchuiao.ppms.entity.Client;
import java.util.List;

/**
 * (Client)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
public interface ClientService {

    /**
     * 通过ID查询单条数据
     *
     * @param cliId 主键
     * @return 实例对象
     */
    Client queryById(Long cliId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Client> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    Client insert(Client client);

    /**
     * 修改数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    Client update(Client client);

    /**
     * 通过主键删除数据
     *
     * @param cliId 主键
     * @return 是否成功
     */
    boolean deleteById(Long cliId);

    Object queryAll();

    Client queryByAccId(Long accId);
}