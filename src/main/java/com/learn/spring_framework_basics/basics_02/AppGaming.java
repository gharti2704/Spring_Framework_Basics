package com.learn.spring_framework_basics.basics_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learn.spring_framework_basics.basics_02.games.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn.spring_framework_basics.basics_02.games")
public class AppGaming {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppGaming.class);
        context.getBean(GameRunner.class).runGame();
    }
}
