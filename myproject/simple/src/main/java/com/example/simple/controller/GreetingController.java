package com.example.simple.controller;

import com.example.simple.bean.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chengjiapeng on 2017/3/21.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private static AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world")String name) {
        return new Greeting(atomicLong.incrementAndGet(), String.format(template,name));
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
