package com.yangkai.controller;

import com.yangkai.entity.User;
import com.yangkai.mapper.UserMapper;
import com.yangkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello/{name}")
    @ResponseBody
    private  String home(@PathVariable String name) {
        System.out.println(name);

        return "Hello ,spring boot!" +name;
    }






}