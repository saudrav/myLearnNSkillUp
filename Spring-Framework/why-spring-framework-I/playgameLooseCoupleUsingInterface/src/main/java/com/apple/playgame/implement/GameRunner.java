package main.java.com.apple.playgame.implement;


public class GameRunner {
	
	private GamingConsole game;
		
	public GameRunner(GamingConsole game) {
		//System.out.println("Using Constructor");
		this.game = game;
	}	

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
