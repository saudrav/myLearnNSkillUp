package com.saudrav.learn.startSpringFramework.service;

import com.saudrav.learn.startSpringFramework.games.MarioGame;
import com.saudrav.learn.startSpringFramework.games.SuperContraGame;

public class GameRunner {

    //private MarioGame game;
    //private SuperContraGame game;
    private GameRunnerConsole game;

    public GameRunner(GameRunnerConsole game) {
        this.game = game;
    }

    public void run() {
        String output = "";
        output += game.up() + "\n";
        output += game.down() + "\n";
        output += game.left() + "\n";
        output += game.right() + "\n";
        System.out.println(output);
    }
}
