package com.learn_spring_bean.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // this annotation will make this class as primary class
// if there are multiple classes implementing same interface and no @Qualifier annotation is used
public class Mario implements GameInterface{
    @Override
    public void up() {
        System.out.println("Mario up");
    }

    @Override
    public void down() {
        System.out.println("Mario down");
    }

    @Override
    public void left() {
        System.out.println("Mario left");
    }

    @Override
    public void right() {
        System.out.println("Mario right");
    }
}
