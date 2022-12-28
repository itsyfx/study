package com.demo.javaGuide.part.basic;

import redis.clients.jedis.Jedis;

public class MyJedisDemo {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.3.2",6379);
        System.out.println(jedis.ping());

        String phoneNumber = "13888888888";
        String userCode = "721367";

        String phoneNumberRedis = jedis.get(phoneNumber);
        if(phoneNumberRedis == null){
            jedis.setex(phoneNumber,999999,"1");
        }else if (Integer.valueOf(phoneNumberRedis) <= 2){
            jedis.incr(phoneNumber);
        }else{
            System.out.println("到达当日最大次数！");
            jedis.close();
            return;
        }



        jedis.close();
    }

}
