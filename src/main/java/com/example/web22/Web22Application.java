package com.example.web22;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.web22.dao")
public class Web22Application {

    public static void main(String[] args) {
        SpringApplication.run(Web22Application.class, args);
    }

}
