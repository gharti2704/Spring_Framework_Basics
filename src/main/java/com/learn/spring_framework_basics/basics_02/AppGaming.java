package com.learn.spring_framework_basics.basics_02;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learn.spring_framework_basics.basics_02.games.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn.spring_framework_basics.basics_02.games")
public class AppGaming {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppGaming.class)) {
			context.getBean(GameRunner.class).runGame();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
