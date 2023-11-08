package com.learn.spring_framework_basics.basics_02.games;

public class Pacman implements GamingConsole {
    public void up() {
        System.out.println("Pacman Jumping up");
    }

    public void down() {
        System.out.println("Pacman Going down");
    }

    public void left() {
        System.out.println("Pacman Going left");
    }

    public void right() {
        System.out.println("Pacman Going right");
    }
}
