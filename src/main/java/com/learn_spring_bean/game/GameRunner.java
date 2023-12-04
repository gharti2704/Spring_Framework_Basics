package com.learn_spring_bean.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

        private final GameInterface game;

        public GameRunner( GameInterface game) {
            this.game = game;
        }

        public void run() {
            game.up();
            game.down();
            game.left();
            game.right();
        }
}
