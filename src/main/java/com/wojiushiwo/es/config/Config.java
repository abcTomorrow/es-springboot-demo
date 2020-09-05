package com.wojiushiwo.es.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by myk
 * 2020/9/5 上午11:42
 */
@Configuration
@MapperScan(basePackages = "com.wojiushiwo.es.mapper")
@EnableTransactionManagement
public class Config {


    @Autowired
    private Environment env;

    @Value("${spring.datasource.url}")
    private String url;

    /**
     * 使用DruidDataSource数据源  具体要怎么使用 需要学习下
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        return dataSource;
    }


}
