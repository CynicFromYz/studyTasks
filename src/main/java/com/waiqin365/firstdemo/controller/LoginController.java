package com.waiqin365.firstdemo.controller;

import com.waiqin365.firstdemo.annotation.MyLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    @ResponseBody
    @MyLog()
    public String login() {
        redisTemplate.opsForValue().set("name", "Giiallo");
        return "you have login";
    }
}
