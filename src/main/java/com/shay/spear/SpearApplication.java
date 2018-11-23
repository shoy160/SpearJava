package com.shay.spear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shay.spear.domain.mapper")
public class SpearApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpearApplication.class, args);
    }
}
