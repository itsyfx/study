package com.demo.javaGuide.controller;

import com.demo.javaGuide.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "redis接口")
@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/get")
    @ApiOperation(value = "简单测试")
    public String getRedisData(){
        return redisService.getRedisData();
    }

    @ApiOperation(value = "联通性测试")
    @GetMapping("/test")
    public void test(){
        System.out.println("xxx");
    }
}
