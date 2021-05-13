package com.hongzhang.da;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 */
@SpringBootApplication
@MapperScan("com.hongzhang.da.dao")
public class DaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaApplication.class, args);
    }

}
