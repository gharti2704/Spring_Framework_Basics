package com.learn.spring_framework_basics.basics_06;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppCDIContext {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppCDIContext.class)) {
			System.out.println(context.getBean(BusinessService.class).getDataService());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
