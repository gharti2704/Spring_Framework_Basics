package com.learn.spring_framework_basics.basics_02.games;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GamingConsole {
    public void up() {
        System.out.println("Super Contra Jumping up");
    }

    public void down() {
        System.out.println("Super Contra Going down");
    }

    public void left() {
        System.out.println("Super Contra Going left");
    }

    public void right() {
        System.out.println("Super Contra Going right");
    }
}
