package com.saimi.power.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by saimi on 2022/4/8.
 */
@Configuration
@MapperScan("com.saimi.power.mbg.mapper")
public class MyBatisConfig {
}
