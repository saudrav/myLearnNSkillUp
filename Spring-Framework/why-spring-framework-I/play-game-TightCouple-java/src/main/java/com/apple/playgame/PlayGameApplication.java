package main.java.com.apple.playgame;

import main.java.com.apple.playgame.implement.GameRunner;
import main.java.com.apple.playgame.implement.SuperContraGame;


public class PlayGameApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PlayGameApplication.class, args);
		
		//MarioGame game = new MarioGame();
		
		SuperContraGame game = new SuperContraGame();
		
		//PacManGame game = new PacManGame();
		
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
