/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.yusk.demoweb.core.controller;

import com.example.springbootstarterdemo.hello.HelloService;
import com.yusk.demoweb.core.config.TestProperties;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author yusk
 * @version V1.0
 * @since 2019-05-14 15:03
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;
    @Resource
    private TestProperties testProperties;

    @RequestMapping("/hello")
    public String sayhello() {
        return helloService.sayHello();
        //        return testProperties.getMsg() + "__________" + testProperties.getRemark();
    }
}
