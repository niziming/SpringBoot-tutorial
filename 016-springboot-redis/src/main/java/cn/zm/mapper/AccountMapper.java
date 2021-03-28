package cn.zm.mapper;

import cn.zm.model.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {
    @Select("select * from account")
    List<Account> listAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}