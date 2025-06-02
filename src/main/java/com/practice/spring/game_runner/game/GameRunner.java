package com.practice.spring.game_runner.game;

public class GameRunner {
    MarioGame game;
    SuperContraGame game1;
    public GameRunner(MarioGame game) {
        this.game = game;
    }
    public GameRunner(SuperContraGame game) {
        this.game1 = game;
    }

    public void run() {
        game1.up();
        game1.down();
        game1.left();
        game1.right();

    }
}
