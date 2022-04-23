package com.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.demo.api.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(version = "1.1")
    private DemoService demoService;

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @GetMapping("/demo/print")
    public String print(@RequestParam String msg){
        return demoService.print(msg);
    }


    public String fallbackMethod(String msg){
        return "妈呀限流啦~~";
    }

}
