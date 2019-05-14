/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.springbootstarterdemo.hello;

/**
 * HelloService
 *
 * @author yusk
 * @version V1.0
 * @since 2019-05-14 17:14
 */
public class HelloService {

    private String someone;

    private String msg;

    public String sayHello() {
        return msg + "," + someone;
    }

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
