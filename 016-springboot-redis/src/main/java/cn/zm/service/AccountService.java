package cn.zm.service;

import cn.zm.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> listAll();
    Account selectByPrimaryKey(Integer id);
    Integer updateByPrimaryKeySelective(Account record);
    Integer add(Account record);
    Integer remove(Integer integer);
    /**
     * 获取学生总人数
     * @return
     */
    Long queryAllStudentCount();
}
