package com.saudrav.learn.startSpringFramework;

import com.saudrav.learn.startSpringFramework.games.SuperContraGame;
import com.saudrav.learn.startSpringFramework.service.GameRunner;
import com.saudrav.learn.startSpringFramework.games.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StartSpringFrameworkApplication.class, args);

        //MarioGame game = new MarioGame();
        SuperContraGame game = new SuperContraGame();

        GameRunner runner = new GameRunner(game);
        runner.run();
	}

}
