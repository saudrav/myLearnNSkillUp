package main.java.com.apple.playgame.implement;

public class GameRunner {
	
	//private MarioGame game;
	private SuperContraGame game;
	//private PacManGame game;
	
		
//	public GameRunner(MarioGame game) {
//		//System.out.println("Using Constructor");
//		this.game = game;
//	}
	
	
	public GameRunner(SuperContraGame game) {
		//System.out.println("Using Constructor");
		this.game = game;
	}
	
	
//	public GameRunner(PacManGame game) {
//		//System.out.println("Using Constructor");
//		this.game = game;
//	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
