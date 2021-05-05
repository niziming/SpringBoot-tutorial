package cn.zm.controller;

import cn.zm.model.Account;
import cn.zm.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {
    @Resource
    AccountService accountService;

    @GetMapping
    public List<Account> listAll() {
        return accountService.listAll();
    }
}
