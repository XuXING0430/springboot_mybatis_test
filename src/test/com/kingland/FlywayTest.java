package com.kingland;

import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xsk
 * @date 2020-08-02 22:00
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application.properties")
public class FlywayTest {

//    @Test
//    public void testFlyway() {

    static final Logger logger = LoggerFactory.getLogger(FlywayTest.class);

        @Value("${spring.datasource.url}")
        private String url;

        @Value("${spring.datasource.user}")
        private String user;

        @Value("${spring.datasource.password}")
        private String password;

        @Test
        public void test1(){
            System.out.println(url);
//            logger.debug(url);
        }

        @Test
    public void testFlyway() {

//        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();


        // 创建 flyway_schema_history 表

//		flyway.baseline();


        // 删除 flyway_schema_history 表中失败的记录

//		flyway.repair();


        // 检查 sql 文件

//		flyway.validate();


        // 执行数据迁移

//        flyway.migrate();


        // 删除当前 schema 下所有表

//		flyway.clean();

    }

}
