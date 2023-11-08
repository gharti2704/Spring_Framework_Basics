package com.learn.spring_framework_basics.basics_01.games;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
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
