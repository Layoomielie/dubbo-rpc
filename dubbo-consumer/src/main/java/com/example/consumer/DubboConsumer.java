package com.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.SayHelloApi;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：张鸿建
 * @time：2019/12/11 11:14
 * @desc：
 **/
@Component
@RestController
public class DubboConsumer {
    @Reference
    private SayHelloApi sayHelloApi;

    @RequestMapping("test")
    public String testSay(){
        System.out.println(sayHelloApi.say("dubbo"));
        return "dubbo test success";
    }

}
