package com.example.ribbonclient;

import com.example.ribbonclient.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "client", configuration = RibbonConfig.class)
public class RibbonclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonclientApplication.class, args);
	}
}
