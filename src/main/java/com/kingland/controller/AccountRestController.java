package com.kingland.controller;

import com.kingland.domian.Account;
import com.kingland.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xsk
 * @date 2020-07-31 22:04
 *
 */
@RestController
public class AccountRestController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/test/account",method = RequestMethod.GET)
    public Account findAccount(@RequestParam(value = "username",required = true) String username){
        return accountService.findAccountByName(username);
    }

    @RequestMapping(value = "/test/accounts",method = RequestMethod.GET)
    public List<Account> GetALLAccounts(){
        return accountService.getAllAccounts();
    }
}
