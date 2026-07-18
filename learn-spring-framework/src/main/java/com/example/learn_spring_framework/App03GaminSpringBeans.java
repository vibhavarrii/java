package com.example.learn_spring_framework;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.PacManGame;
@Configuration
public class App03GaminSpringBeans {
	

	public static void main(String[] args) {
		try (var Context = new AnnotationConfigApplicationContext(GamingConference.class)) {
			Context.getBean(GamingConsole.class).up();
			Context.getBean(GameRunner.class).run();
//		//launch a spring Context
//		// TODO Auto-generated method stub
//				//we get output for both
//				//var game = new MarioGame();
//				//var game = new SuperContraGame();
//				var game = new PacManGame();//Object Creation
//				var gameRunner = new GameRunner(game);//wiring of dependencies 
//				//game is dependency of gamerunnerclass..we are injecting into the class
//				gameRunner.run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
