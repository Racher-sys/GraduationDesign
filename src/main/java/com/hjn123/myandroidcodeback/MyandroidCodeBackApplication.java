package com.hjn123.myandroidcodeback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.hjn123.myandroidcodeback.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MyandroidCodeBackApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyandroidCodeBackApplication.class, args);
    }

}
