package com.learn_spring_bean.dependecy_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AppDependencyInjection {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppDependencyInjection.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
