package com.kingland.service.impl;

import com.kingland.dao.AccountDao;
import com.kingland.domian.Account;
import com.kingland.mapper.AccountMapper;
import com.kingland.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xsk
 * @date 2020-07-31 22:03
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    //    private AccountDao accountDao;

    @Override
    public Account findAccountByName(String username) {
        return accountMapper.findAccountByName(username);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountMapper.getAllAccounts();
    }
}
