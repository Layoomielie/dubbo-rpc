package com.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author：张鸿建
 * @time：2019/12/11 10:23
 * @desc：
 **/
public interface SayHelloApi {
    String say(String username);
}
