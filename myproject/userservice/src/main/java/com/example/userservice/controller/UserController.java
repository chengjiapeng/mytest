package com.example.userservice.controller;

import com.example.userservice.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chengjiapeng on 2017/3/16.
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public User getUser() {
        return new User(1l, "zhangsan", "123456");
    }
}
