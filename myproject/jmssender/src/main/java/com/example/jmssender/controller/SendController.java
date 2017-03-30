package com.example.jmssender.controller;

import com.example.jmssender.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
@Controller
public class SendController {
    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        jmsTemplate.convertAndSend("myreceiver", new Message(1l, "hello lisi"));
        return "hello world";
    }
}
