package com.example.web.SpringBootInAction.config;

import com.example.web.SpringBootInAction.Inteceptor.DemoInteceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInteceptor());
    }

    @Bean
    public DemoInteceptor demoInteceptor() {
        return new DemoInteceptor();
    }
}
