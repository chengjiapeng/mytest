package com.example.ribbonserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by chengjiapeng on 2017/3/24.
 */
@RestController
public class ServerController {
    private static Logger logger = LoggerFactory.getLogger(ServerController.class);

    @RequestMapping("/greeting")
    public String greeting() {
        logger.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi There", "Greetings", "Salutations");
        Random random = new Random();

        int randomNum = random.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @RequestMapping("/")
    public String home() {
        logger.info("Access /");
        return "hi";
    }
}
