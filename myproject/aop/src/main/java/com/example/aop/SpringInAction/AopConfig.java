package com.example.aop.SpringInAction;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.aop")
public class AopConfig {
    @Pointcut("execution(* com.example.aop.SpringInAction.BraveKnight.*(..))")
    public void methodPonitCut(){};

//    @Before("methodPonitCut()")
//    public void before() {
//       minstrel().singBeforeQuest();
//
//    }
//
//    @After("methodPonitCut()")
//    public void after() {
//       minstrel().singAfterQuest();
//
//    }

//    @AfterThrowing("methodPonitCut()")
//    public void throwException() {
//        System.out.println("throwing an exception");
//    }

    @Around("methodPonitCut()")
    public void around(ProceedingJoinPoint joinPoint) {

        try {
            minstrel().singBeforeQuest();
            joinPoint.proceed();
            minstrel().singAfterQuest();
        } catch (Throwable throwable) {
            System.out.println("throwing an exception");
        }
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

}
