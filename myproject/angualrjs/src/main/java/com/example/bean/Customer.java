package com.example.bean;

/**
 * Created by chengjiapeng on 2017/3/29.
 */
public class Customer {
    private String name;

    private String country;

    public Customer() {
    }

    public Customer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
