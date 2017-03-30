package com.example.aop;

import com.example.aop.SpringInAction.AopConfig;
import com.example.aop.SpringInAction.BraveKnight;
import com.example.aop.SpringInAction.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embark();
		context.close();
	}
}
