package com.example.jmssender.bean;

import java.io.Serializable;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
public class Message {
    private Long id;

    private String message;

    public Message() {
    }

    public Message(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}