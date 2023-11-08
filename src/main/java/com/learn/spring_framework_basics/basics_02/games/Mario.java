package com.learn.spring_framework_basics.basics_02.games;

public class Mario implements GamingConsole {
    public void up() {
        System.out.println("Mario Jumping up");
    }

    public void down() {
        System.out.println("Mario Going down");
    }

    public void left() {
        System.out.println("Mario Going left");
    }

    public void right() {
        System.out.println("Mario Going right");
    }
}
