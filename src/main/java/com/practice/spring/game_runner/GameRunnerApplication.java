package com.practice.spring.game_runner;

import com.practice.spring.game_runner.game.GameRunner;
import com.practice.spring.game_runner.game.MarioGame;
import com.practice.spring.game_runner.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GameRunnerApplication.class, args);
//		MarioGame game = new MarioGame();
		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
