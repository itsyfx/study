package com.demo.javaGuide.controller;

import com.demo.javaGuide.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping("get2")
    public String getRedisData(){
        return redisService.getRedisData();
    }

    @GetMapping("/test")
    public void test(){
        System.out.println("xxx");
    }
}
