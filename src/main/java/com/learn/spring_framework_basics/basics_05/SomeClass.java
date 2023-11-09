package com.learn.spring_framework_basics.basics_05;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    private final SomeDependencyClass someDependencyClass;
    public SomeClass (SomeDependencyClass someDependencyClass) {
        super();
        this.someDependencyClass = someDependencyClass;

        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialize () {
        someDependencyClass.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean up!");
    }
}
