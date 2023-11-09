package com.learn.spring_framework_basics.basics_05;

import org.springframework.stereotype.Component;

@Component
public class SomeDependencyClass {
    public void getReady() {
        System.out.println("Write logics here using SomeDependency");
    }
}
