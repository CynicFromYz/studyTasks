package com.waiqin365.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        return "you have login";
    }

}
