package cn.zm.controller;

import cn.zm.mapper.AccountMapper;
import cn.zm.model.Account;
import cn.zm.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public Object getOne(@PathVariable Integer id) {
        return accountService.selectByPrimaryKey(id);
    }

    @PutMapping
    public Integer modify(Account account) {
        return accountService.updateByPrimaryKeySelective(account);
    }

    @PostMapping
    public Integer add(Account account) {
        return accountService.updateByPrimaryKeySelective(account);
    }

    @DeleteMapping
    public Integer remove(Integer id) {
        return accountService.remove(id);
    }
}
