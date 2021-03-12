package com.lpras.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = { "com.lpras.spring" })
public class MyAppConfig {
    @Bean
    public DataSource dataSource() {
	BasicDataSource bds = new BasicDataSource();
	bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	bds.setUrl("jdbc:mysql://127.0.0.1:3306/myspringdb");
	bds.setUsername("lpras");
	bds.setPassword("lpras");
	bds.setInitialSize(10);
	bds.setMaxActive(15);
	return bds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
	return new JdbcTemplate(ds);
    }
}
