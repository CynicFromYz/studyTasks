package com.waiqin365.firstdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FirstDemoApplication.class)
public class FirstDemoApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        String val = (String) redisTemplate.opsForValue().get("1");
    }

}
