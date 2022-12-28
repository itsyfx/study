package com.demo.javaGuide.service.impl;

import com.demo.javaGuide.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public String getRedisData() {
        redisTemplate.opsForValue().set("1","1");
        return redisTemplate.opsForValue().get("1");
    }
}
