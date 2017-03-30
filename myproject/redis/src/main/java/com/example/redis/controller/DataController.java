package com.example.redis.controller;

import com.example.redis.bean.Person;
import com.example.redis.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chengjiapeng on 2017/3/27.
 */
@RestController
public class DataController {
    @Autowired
    private PersonDao personDao;

    @RequestMapping("/set")
    public void set() {
        Person person = new Person("1", "wyf", 32);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();
    }

    @RequestMapping("/getStr")
    public String getStr() {
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        return personDao.getPerson();
    }

}
