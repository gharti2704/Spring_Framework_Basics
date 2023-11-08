package com.learn.spring_framework_basics.basics_01.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

public class AppHelloWorldSrpingBeans {
    public static void main(String[] args) {
        //Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Configure the things that we want Spring to manage - @Configuration
        //Get the bean from Spring Context
        var name = context.getBean("name", String.class);
        System.out.println(name);

        var age = context.getBean("age");
        System.out.println(age);

        var person = context.getBean("person");
        System.out.println(person);

        var address = context.getBean("address");
        System.out.println(address);

        var address2 = context.getBean("address2");
        System.out.println(address2);

        var address3 = context.getBean(Address.class);
        System.out.println(address3);

        //Get all Spring Beans
        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );
    }
}
