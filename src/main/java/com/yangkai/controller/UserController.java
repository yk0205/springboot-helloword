package com.yangkai.controller;

import com.yangkai.entity.User;
import com.yangkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getAllUser")
    @ResponseBody
    private List<User> getAllUser() {
        List<User> users =  userService.getAllUser();

        return users;


    }


}
