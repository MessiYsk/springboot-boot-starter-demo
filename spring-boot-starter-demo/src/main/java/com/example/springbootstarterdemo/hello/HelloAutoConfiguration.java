/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.springbootstarterdemo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloAutoConfiguration
 *
 * @author yusk
 * @version V1.0
 * @since 2019-05-14 17:02
 */
@Configuration//开启配置
@ConditionalOnBean(annotation = EnableHelloAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)//开启使用映射实体对象
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
    (prefix = "hello",//存在配置前缀hello
        value = "enabled",//开启
        matchIfMissing = true//缺失检查
    )
public class HelloAutoConfiguration {

    //application.properties配置文件映射前缀实体对象
    @Autowired
    private HelloProperties helloProperties;


    @Bean//创建HelloService实体bean
    @ConditionalOnMissingBean(HelloService.class)//缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    public HelloService helloService() {
        System.out.println(">>>The HelloService Not Found，Execute Create New Bean.");
        HelloService helloService = new HelloService();
        helloService.setSomeone(helloProperties.getSomeone());//设置消息内容
        helloService.setMsg(helloProperties.getMsg());//设置是否显示
        return helloService;
    }
}
