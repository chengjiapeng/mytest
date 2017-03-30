package com.example.websocket2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
@Controller
public class WsController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if(principal.getName().equals("wyf")) {
            messagingTemplate.convertAndSendToUser("wisely", "/queue/notifications", principal.getName()+"-send :"+msg);
        }
        else {
            messagingTemplate.convertAndSendToUser("wyf", "/queue/notifications", principal.getName()+"/send:"+msg);
        }
    }
}
