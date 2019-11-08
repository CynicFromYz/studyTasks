package com.waiqin365.firstdemo.controller;

import com.waiqin365.firstdemo.annotation.MyLog;
import com.waiqin365.firstdemo.config.redis.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    RedisClientTemplate redisClientTemplate;

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    @ResponseBody
    @MyLog()
    public String login() {
        redisClientTemplate.setValue("name", "Giiallo");
        return "you have login";
    }

}
