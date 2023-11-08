package com.learn.spring_framework_basics.basics_01;

import com.learn.spring_framework_basics.basics_01.games.GameRunner;
import com.learn.spring_framework_basics.basics_01.games.GamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.learn.spring_framework_basics.basics_01.games.*;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
//        var game = new Mario();
        var game = new SuperContra();
//        var game = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gamerunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
