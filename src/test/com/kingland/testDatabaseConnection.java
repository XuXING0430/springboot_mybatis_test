package com.kingland;

import com.kingland.dao.AccountDao;
import com.kingland.domian.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xsk
 * @date 2020-08-01 15:18
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class testDatabaseConnection {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testDao(){

        Account testAccount = accountDao.findAccountByName("livepool");
        Assert.assertEquals(testAccount.getPassword(), "18942020");
    }
}
