package cn.zm.controller;

import cn.zm.model.Account;
import cn.zm.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("redis")
public class RedisController {
    @Resource
    private AccountService accountService;

    @GetMapping("listAccount")
    public Object listAccount(HttpServletRequest request) {
        List<Account> accounts = accountService.listAll();
        return "学生数量: " + accounts;
    }
}
