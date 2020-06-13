package top.xchuiao.ppms.service.impl;

import top.xchuiao.ppms.entity.Account;
import top.xchuiao.ppms.dao.AccountDao;
import top.xchuiao.ppms.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:50:48
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param accId 主键
     * @return 实例对象
     */
    @Override
    public Account queryById(Long accId) {
        return this.accountDao.queryById(accId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Account> queryAllByLimit(int offset, int limit) {
        return this.accountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account insert(Account account) {
        this.accountDao.insert(account);
        return account;
    }

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account update(Account account) {
        this.accountDao.update(account);
        return this.queryById(account.getAccId());
    }

    /**
     * 通过主键删除数据
     *
     * @param accId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long accId) {
        return this.accountDao.deleteById(accId) > 0;
    }
}