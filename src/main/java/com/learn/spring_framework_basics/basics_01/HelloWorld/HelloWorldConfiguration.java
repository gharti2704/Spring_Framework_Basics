package com.learn.spring_framework_basics.basics_01.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age, Address address){};
record Address (String country, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Raju";
    }

    @Bean
    public int age() {
        return 32;
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("USA", "NEW YORK");
    }

    @Bean
    public Address address2(){
        return new Address("Nepal", "Baglung");
    }

    @Bean
    public Person person (){
        return new Person(name(), age(), address());
    }
}
