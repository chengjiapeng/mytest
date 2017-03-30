package com.example.thymeleaf.bean;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
public class Person {
    private Long id;

    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
