package com.example.di;

import com.example.di.SpringInAction.BraveKnight;
import com.example.di.SpringInAction.Knight;
import com.example.di.SpringInAction.KnightConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embark();
		context.close();
	}
}
