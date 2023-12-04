package com.uknit.basics.introToOOPs;

public class MotorBike {

	// state
	private int speed; // member or instance variable which belongs to an instance or object

	// constructor
	public MotorBike() {
		this.speed = 50;
	}

	// getters and setters
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) { // local variable
		this.speed = speed;
	}

	// behavior
	public void start() {
		System.out.println("started! and initial speed is " + this.speed);
	}

}
