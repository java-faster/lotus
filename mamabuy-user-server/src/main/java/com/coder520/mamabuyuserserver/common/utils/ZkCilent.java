package com.coder520.mamabuyuserserver.common.utils;

import com.coder520.mamabuyuserserver.common.constants.Parameters;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ZkCilent {

    @Autowired
    private Parameters parameters;

    @Bean
    public CuratorFramework getZkClient(){
        CuratorFrameworkFactory.Builder builder=CuratorFrameworkFactory.builder()
                .connectString(parameters.getZkHost())
                .connectionTimeoutMs(30000)
                .retryPolicy(new RetryNTimes(5,500));
        CuratorFramework curatorFramework=builder.build();
        curatorFramework.start();
        return curatorFramework;
    }
}
