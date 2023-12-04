package com.learn_spring_bean.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn_spring_bean.game")
public class AppGame {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppGame.class);
        var gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
