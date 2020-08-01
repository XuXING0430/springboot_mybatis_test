package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xsk
 * @date 2020-07-31 21:44
 *
 */
@SpringBootApplication
@MapperScan("com.kingland.dao")
public class Application {

    public static void main(String[] args) {
        //init program
        SpringApplication.run(Application.class,args);
    }
}
