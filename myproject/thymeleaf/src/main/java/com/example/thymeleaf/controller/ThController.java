package com.example.thymeleaf.controller;

import com.example.thymeleaf.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
@Controller
public class ThController {
    @RequestMapping("/test")
    public String foreach(Model model) {
        Person person1 = new Person(1l, "zhangsan");
        Person person2 = new Person(2l, "lisi");
        Person person3 = new Person(3l, "wangwu");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        model.addAttribute("people", people);
        model.addAttribute("jsTest", "this is js Test");
        model.addAttribute("singlePerson", person1);
        return "foreach";
    }
}
