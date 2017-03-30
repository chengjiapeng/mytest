package com.example.jmsreceiver.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
@Component
public class Receiver {
    @JmsListener(destination = "myreceiver")
    public void receiveMessage(String message) {
        System.out.println("receive:<"+message+">");
    }
}
