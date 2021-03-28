package cn.zm.service;

import cn.zm.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {
    @Resource
    AccountService accountService;
    @Test
    public void listAll() {
        List<Account> accounts = accountService.listAll();
        System.out.println("accounts = " + accounts);
    }
}