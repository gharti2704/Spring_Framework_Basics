package com.learn.spring_framework_basics.basics_01;

import com.learn.spring_framework_basics.basics_01.games.*;

public class AppGaming {
    public static void main(String[] args) {
//       var game = new MarioGame();
//       var game = new SuperContraGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.runGame();
    }
}
