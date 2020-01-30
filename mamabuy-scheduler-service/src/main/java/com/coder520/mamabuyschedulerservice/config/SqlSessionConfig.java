package com.coder520.mamabuyschedulerservice.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.ws.Action;

@Configuration
@MapperScan(basePackages = "com.coder520.mamabuyschedulerservice.stock.dao",sqlSessionFactoryRef = "stockSqlSessionFactory")
public class SqlSessionConfig {

    @Autowired
    @Qualifier("stockDataSource")
    private DataSource stockDataSource;

    @Bean(name="stockSqlSessionFactory")
    public SqlSessionFactory stockSqlSessionFactory() throws Exception{
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(stockDataSource);
        return factoryBean.getObject();
    }

    @Bean("stockSqlSessionTemplete")
    public SqlSessionTemplate stockSqlSessionTemplete() throws Exception{
        SqlSessionTemplate sessionTemplate=new SqlSessionTemplate(stockSqlSessionFactory());
        return  sessionTemplate;
    }
}
