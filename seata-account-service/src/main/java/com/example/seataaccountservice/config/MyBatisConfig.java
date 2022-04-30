package com.example.seataaccountservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.seataaccountservice.dao"})
public class MyBatisConfig {
}
