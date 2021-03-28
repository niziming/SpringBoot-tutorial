package cn.zm.service.impl;

import cn.zm.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceImplTest {
    @Resource
    AccountService accountService;
    @Test
    public void listAll() {
        accountService.listAll();
    }
}