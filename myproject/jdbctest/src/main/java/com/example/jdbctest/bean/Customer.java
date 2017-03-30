package com.example.jdbctest.bean;

/**
 * Created by chengjiapeng on 2017/3/21.
 */
public class Customer {
    private long id;

    private String firstName,lastName;

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName=%s, lastName=%s]", id, firstName, lastName);
    }
}
