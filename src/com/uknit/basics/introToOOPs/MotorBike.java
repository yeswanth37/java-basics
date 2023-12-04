package com.uknit.basics.introToOOPs;

public class MotorBike {

	// state
	public int speed;

	// constructor
	public MotorBike() {
		this.speed = 50;
	}

	// behavior
	public void start() {
		System.out.println("started! and initial speed is " + this.speed);
	}

}
