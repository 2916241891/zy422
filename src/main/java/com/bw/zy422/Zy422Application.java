package com.bw.zy422;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.bw.zy422.dao")
@EnableScheduling
public class Zy422Application {

    public static void main(String[] args) {
        SpringApplication.run(Zy422Application.class, args);
    }

}
