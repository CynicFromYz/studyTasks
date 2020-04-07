package com.waiqin365.firstdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cynic.provider.service.SayHelloService;
import com.waiqin365.firstdemo.util.ZkDistributedLockUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/1/15 16:27
 */
@RequestMapping("/dubbo")
@Controller
public class DubboController {

    @Reference
    SayHelloService sayHelloService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        sayHelloService.sayHello();
        ZkDistributedLockUtils zkDistributedLockUtils = new ZkDistributedLockUtils("cynic_lock");
        zkDistributedLockUtils.tryLock();
        return "see the console~";
    }


}
