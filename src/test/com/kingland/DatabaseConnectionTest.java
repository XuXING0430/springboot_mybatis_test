package com.kingland;


import com.kingland.domian.Account;
import com.kingland.mapper.AccountMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

/**
 * @author xsk
 * @date 2020-08-01 15:18
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DatabaseConnectionTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testDao(){

        Account testAccount =accountMapper.findAccountByName("test1");
        Assert.assertEquals(testAccount.getPassword(), "123456");
    }


    @Test
    public void testfindAll(){

        List<Account> allAccounts = accountMapper.getAllAccounts();
        for (Account allAccount : allAccounts) {
            System.out.println(allAccount.toString());
        }
//        for (Account allAccount : allAccounts) {
//            System.out.println(allAccount.toString());
//        }
//        Iterator<Account> iterator = allAccounts.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }

    }
}
