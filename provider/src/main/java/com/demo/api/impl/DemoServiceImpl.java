package com.demo.api.impl;

import com.demo.api.service.DemoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.apache.dubbo.config.annotation.Service;

import java.util.Random;


@Service(version = "1.1")
public class DemoServiceImpl implements DemoService {

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    @Override
    public String print(String msg) {
        Random random = new Random();
        try{
            if(random.nextBoolean()) {
                Thread.sleep(2000);
            }
        }catch (Exception e){
            //ignored
        }
        return msg;
    }
}
