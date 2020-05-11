package com.swallows.swallowscore.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */

@Configuration
@MapperScan("com.swallows.swallowsmbg.mapper")
public class MyBatisConfig {
}
