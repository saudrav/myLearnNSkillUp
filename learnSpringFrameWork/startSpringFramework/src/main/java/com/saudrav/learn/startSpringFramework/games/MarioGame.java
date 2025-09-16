package com.saudrav.learn.startSpringFramework.games;

import com.saudrav.learn.startSpringFramework.service.GameRunnerConsole;

public class MarioGame implements GameRunnerConsole {

    public String up() {
        return "Mario jumps";
    }
    public String down() {
        return "Mario goes into a hole";
    }
    public String left() {
        return "Mario goes back";
    }
    public String right() {
        return "Mario runs";
    }

}
