package com.coder520.mamabuyuserserver.common.config;


import com.coder520.mamabuyuserserver.common.constants.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * Created by JackWangon[www.coder520.com] 16:26 2018/1/6.
 */
@Slf4j
@Configuration
@EnableRedisHttpSession //(maxInactiveIntervalInSeconds = 604800)//session超时
public class HttpSessionConfig {


    @Autowired
    private Parameters parameters;

    @Bean
    public HttpSessionStrategy httpSessionStrategy(){

        return  new HeaderHttpSessionStrategy();

    }

    @SuppressWarnings("Duplicates")
    @Bean
    public JedisConnectionFactory connectionFactory(){

        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();

        String redisHost = parameters.getRedisNode().split(":")[0];
        log.info("当前redis地址为:"+redisHost);
        int redisPort = Integer.valueOf(parameters.getRedisNode().split(":")[1]);

        connectionFactory.setTimeout(2000);
        connectionFactory.setHostName(redisHost);
        connectionFactory.setPort(redisPort);
        connectionFactory.setPassword(parameters.getRedisAuth());

        return connectionFactory;

    }



}
