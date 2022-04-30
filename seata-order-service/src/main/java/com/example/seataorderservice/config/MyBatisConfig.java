package com.example.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.seataorderservice.dao"})
public class MyBatisConfig {
}