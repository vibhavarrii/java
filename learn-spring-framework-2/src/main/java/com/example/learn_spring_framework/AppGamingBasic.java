package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacManGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we get output for both
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();//Object Creation
		var gameRunner = new GameRunner(game);//wiring of dependencies 
		//game is dependency of gamerunnerclass..we are injecting into the class
		gameRunner.run();

	}

}
