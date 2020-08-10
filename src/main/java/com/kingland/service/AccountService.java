package com.kingland.service;

import com.kingland.domian.Account;

import java.util.List;

/**
 * @author xsk
 * @date 2020-07-31 22:03
 *
 */
public interface AccountService {

    Account findAccountByName(String username);

    List<Account> getAllAccounts();
}
