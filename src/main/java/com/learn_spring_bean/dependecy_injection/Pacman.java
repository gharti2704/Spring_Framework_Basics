package com.learn_spring_bean.dependecy_injection;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GameInterface {
    @Override
    public void up() {
        System.out.println("Pacman up");
    }

    @Override
    public void down() {
        System.out.println("Pacman down");
    }

    @Override
    public void left() {
        System.out.println("Pacman left");
    }

    @Override
    public void right() {
        System.out.println("Pacman right");
    }
}
