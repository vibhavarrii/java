package com.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike Dukati = new MotorBike(100);
		MotorBike Honda = new MotorBike(80);
		MotorBike hii = new MotorBike();
		System.out.println(hii.getSpeed());
		//Dukati.start();
		//Honda.start();
		//Dukati.setSpeed(100);
		//Dukati.increaseSpeed(100);
		//Dukati.decreaseSpeed(100);
		//Honda.setSpeed(80);
		//Honda.decreaseSpeed(100);
		System.out.println(Dukati.getSpeed());
		System.out.println(Honda.getSpeed());
		//System.out.println(Dukati.getSpeed());
		

	}
	
}
