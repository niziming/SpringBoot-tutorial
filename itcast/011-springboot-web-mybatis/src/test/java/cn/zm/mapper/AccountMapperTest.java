package cn.zm.mapper;

import cn.zm.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {
    @Resource
    AccountMapper accountMapper;

    @Test
    public void listAll() {
        List<Account> accounts = accountMapper.listAll();
        System.out.println("accounts = " + accounts);
    }

    @Test
    public void selectByPrimaryKey() {
        Account account = accountMapper.selectByPrimaryKey(1);
        System.out.println("account = " + account);
    }
}