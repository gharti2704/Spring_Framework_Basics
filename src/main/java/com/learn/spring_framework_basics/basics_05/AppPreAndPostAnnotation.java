package com.learn.spring_framework_basics.basics_05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppPreAndPostAnnotation {

    public static void main (String[] args) {
        var context = new AnnotationConfigApplicationContext(AppPreAndPostAnnotation.class);
        System.out.println(context.getBean(SomeClass.class));
        System.out.println(context.getBean(SomeClass.class));
        System.out.println(context.getBean(SomeClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));

    }
}
