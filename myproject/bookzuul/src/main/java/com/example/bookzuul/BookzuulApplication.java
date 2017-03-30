package com.example.bookzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BookzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzuulApplication.class, args);
	}
}
