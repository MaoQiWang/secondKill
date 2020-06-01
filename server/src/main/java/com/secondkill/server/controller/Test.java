package com.secondkill.server.controller;

import com.secondkill.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Test {

    @Autowired
    UserService userService;

    @RequestMapping("test")
    public String test(){
        System.out.println(userService.selectByUsername("debug"));

        return "welcome";
    }

}
