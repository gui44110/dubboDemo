package com.dyl.dubbo.demo.impl;

import com.dyl.dubbo.demo.DubboDemoService;

/**
 * @Author: dongyuliang@meicai.cn
 * @Date: 2018/11/23 11:32
 */
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
