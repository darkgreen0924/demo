package com.lq.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MybatisConfig
 *
 * @author qingqing
 * @date 2025/2/16
 */

@Configuration
@MapperScan(value = {"com.lq.demo.dao", "com.lq.demo.mapper"})
@EnableTransactionManagement
public class MybatisConfig {
}
