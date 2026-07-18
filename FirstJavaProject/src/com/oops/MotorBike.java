package com.oops;

public class MotorBike {
	private int speed;
	
	MotorBike(){
		this(5);
	}
	
	MotorBike(int speed){
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;
	
	}
	public void increaseSpeed(int increase) {
		setSpeed(this.speed + increase);
	}
	public void decreaseSpeed(int decrease) {
		setSpeed(this.speed - decrease);
	}

	void start() {
		System.out.println("starting");
	}

}
