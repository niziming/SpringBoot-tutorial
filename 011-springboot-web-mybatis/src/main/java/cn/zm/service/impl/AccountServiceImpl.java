package cn.zm.service.impl;

import cn.zm.mapper.AccountMapper;
import cn.zm.model.Account;
import cn.zm.service.AccountService;
import org.springframework.stereotype.Service;

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
}
