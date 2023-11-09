package com.learn.spring_framework_basics.basics_03;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do something here");
    }
}
