package cn.zm.service.impl;

import cn.zm.mapper.AccountMapper;
import cn.zm.model.Account;
import cn.zm.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountMapper accountMapper;
    @Override
    public List<Account> listAll() {
        return accountMapper.listAll();
    }

    @Override
    public Account selectByPrimaryKey(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional // 添加此注解说明该方法添加的事务管理
    public Integer updateByPrimaryKeySelective(Account record) {
        int i = accountMapper.updateByPrimaryKeySelective(record);
        //int a = 10/0;
        return i;
    }

    @Override
    @Transactional // 添加此注解说明该方法添加的事务管理
    public Integer add(Account record) {
        return accountMapper.insert(record);
    }

    @Override
    public Integer remove(Integer integer) {
        return accountMapper.deleteByPrimaryKey(integer);
    }
}
