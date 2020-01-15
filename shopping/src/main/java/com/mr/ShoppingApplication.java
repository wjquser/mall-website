package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mr.mapper")
@MapperScan("com.mr.dao")
public class ShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }

}
