package com.example.controller;

import com.example.bean.Customer;
import com.example.bean.Message;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengjiapeng on 2017/3/28.
 */
@RestController
public class OneController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public Message welcome() {
        return new Message("welcome to this page");
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public List<Customer> allUser() {
        Customer customer1 = new Customer("zhangsan", "China");
        Customer customer2 = new Customer("lisi", "USA");
        Customer customer3 = new Customer("wangwu", "UK");
        List<Customer> userList = new ArrayList<>();
        userList.add(customer1);
        userList.add(customer2);
        userList.add(customer3);
        return userList;
    }
}
