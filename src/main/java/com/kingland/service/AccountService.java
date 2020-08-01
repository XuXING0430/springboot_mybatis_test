package com.kingland.service;

import com.kingland.domian.Account;

/**
 * @author xsk
 * @date 2020-07-31 22:03
 *
 */
public interface AccountService {
    Account findAccountByName(String username);
}
