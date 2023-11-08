package com.learn.spring_framework_basics.basics_02.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;
    public GameRunner(@Qualifier("PacmanQualifier") GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
