package com.apple.game.playgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.apple.game.playgame.implement.GameRunner;

@SpringBootApplication
public class PlayGameApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(PlayGameApplication.class, args);
		
		GameRunner runner = applicationContext.getBean(GameRunner.class);
		
		runner.runGame();
	}

	
}
