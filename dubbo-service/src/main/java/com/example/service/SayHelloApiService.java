package com.example.service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.entity.User;
import com.service.SayHelloApi;
import org.springframework.stereotype.Component;

/**
 * @author：张鸿建
 * @time：2019/12/11 10:26
 * @desc：
 **/
@Service(interfaceClass = SayHelloApi.class)
@Component
public class SayHelloApiService implements SayHelloApi {
    @Override
    public String say(String username) {
        if(StringUtils.isBlank(username)){
            return "error,name is blank";
        }
        return username + ",hello dubbo api";
    }
}
