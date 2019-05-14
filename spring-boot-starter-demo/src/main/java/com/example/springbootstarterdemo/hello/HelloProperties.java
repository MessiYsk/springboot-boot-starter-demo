/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.springbootstarterdemo.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置
 *
 * @author yusk
 * @version V1.0
 * @since 2019-05-14 17:02
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String someone = "yusk";

    private String msg = "hello";

    public String getSomeone() {
        return someone;
    }

    public void setSomeone(String someone) {
        this.someone = someone;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
