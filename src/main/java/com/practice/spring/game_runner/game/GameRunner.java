package com.practice.spring.game_runner.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
