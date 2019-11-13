package com.waiqin365.firstdemo.controller;

import com.waiqin365.firstdemo.util.RedisLockUtils;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    JedisCluster jedisCluster;

    @Autowired
    RedisLockUtils redisLockUtils;

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    @ResponseBody
//    @MyLog()
    public String login(@Param("key") String key, @Param("value") String value) throws IOException {
        redisTemplate.opsForValue().set(key, value);
        String val = (String) redisTemplate.opsForValue().get(key);
        System.out.println(val);
        redisLockUtils.lock("syncLock");
        return "you have login";
    }
}
