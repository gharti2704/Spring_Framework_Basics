package com.learn_spring_bean.dependecy_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

        private final GameInterface game;

        @Autowired
        public GameRunner( GameInterface game) {
            super();
            this.game = game;
        }

        public void run() {
            game.up();
            game.down();
            game.left();
            game.right();
        }
}
