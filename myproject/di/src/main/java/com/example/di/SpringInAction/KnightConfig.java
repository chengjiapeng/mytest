package com.example.di.SpringInAction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }
}
