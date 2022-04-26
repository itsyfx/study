package com.demo.controller;


import com.demo.api.service.ConfigService;
import com.demo.entity.telex.Parameter;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class DemoController {

    @Autowired
    private ConfigService configService;

    /**
     *  为了测试dashboard 监控
     * @param msg
     * @return
     */
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    @GetMapping(value = "/pro/print")
    public String print(@RequestParam String msg){
        if(new Random().nextBoolean()){
            try{
                Thread.sleep(1100);
            }catch (Exception e){
                //ignored
            }
        }
        return msg;
    }

    @GetMapping(value = "/param/findAll")
    public List<Parameter>  queryParamAll(){
        return configService.findAll();
    }

}
