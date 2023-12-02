package com.learn.spring_framework_basics.basics_03;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppLazyInitialization {

    public static void main (String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppLazyInitialization.class)) {
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomething();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
