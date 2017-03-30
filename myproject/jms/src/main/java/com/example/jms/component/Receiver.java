package com.example.jms.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
@Component
public class Receiver {
    @JmsListener(destination = "my-destination")
    public void receiveMessage(String message){
        System.out.println("接收到：<"+message+">");
    }
}
