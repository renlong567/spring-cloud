package com.example.seatastorageservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.seatastorageservice.dao"})
public class MyBatisConfig {
}
