package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan({"com.web.*","com.service.*","com.api.*"})
@MapperScan("com.api.*")
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
