package com.coder520.mamabuytradeserver;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.coder520.mamabuytradeserver.common.constants.Parameters;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.client.http.JestHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class MamabuyTradeServerApplication {

    @Autowired
    private Parameters parameters;

    public static void main(String[] args) {
        SpringApplication.run(MamabuyTradeServerApplication.class, args);
    }

    @Bean
    public JestHttpClient getESClient(){
        JestClientFactory factory=new JestClientFactory();
        factory.setHttpClientConfig(new HttpClientConfig.Builder(
                "http://"+parameters.getEsHost())
                 .multiThreaded(true)
                 .readTimeout(5000)
                  .build());
        JestHttpClient jestHttpClient=(JestHttpClient)factory.getObject();
        return  jestHttpClient;
    }

    /**
     * FastJsonHttpMessageConverter
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

    /**
     * 用于properties文件占位符解析
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
