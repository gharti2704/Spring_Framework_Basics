package com.learn.spring_framework_basics.basics_02.dependency_injection_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppBusinessCalculationService {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppBusinessCalculationService.class);
        System.out.println("The max amount is: " + context.getBean(BusinessCalculationService.class).findMax());

    }
}
