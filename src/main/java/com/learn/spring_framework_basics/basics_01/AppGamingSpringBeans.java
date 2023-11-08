package com.learn.spring_framework_basics.basics_01;

import com.learn.spring_framework_basics.basics_01.games.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GameRunner.class).runGame();
    }
}
