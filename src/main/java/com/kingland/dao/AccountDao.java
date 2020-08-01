package com.kingland.dao;

import com.kingland.domian.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @author xsk
 * @date 2020-07-31 21:42
 *
 */
public interface AccountDao {
    Account findAccountByName(@Param("username") String username);

}
