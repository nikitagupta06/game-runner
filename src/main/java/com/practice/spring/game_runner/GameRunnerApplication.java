package com.practice.spring.game_runner;

import com.practice.spring.game_runner.enterprise.example.web.MyWebController;
import com.practice.spring.game_runner.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practice.spring.game_runner.game")
@ComponentScan("com.practice.spring.game_runner.enterprise.example")
public class GameRunnerApplication {

	public static void main(String[] args) {

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();

//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);

		ConfigurableApplicationContext context = SpringApplication.run(GameRunnerApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());

	}

}
