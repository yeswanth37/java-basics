package com.uknit.basics.introToOOPs;

public class MotorBike {

	// state
	private int speed; // member or instance variable which belongs to an instance or object

	// default constructor
	public MotorBike() {
		this(5);
	}

	// constructor with one parameter speed of type int
	// sets initial speed to a MotorBike instance
	public MotorBike(int speed) {
		this.speed = speed;
	}

	// getters and setters
	public int getSpeed() {
		return this.speed;
	}

	// Advantage of Encapsulation is to prevent bad data being set to our objects
	// we can prevent bad data being set for our member variables through setters
	public void setSpeed(int speed) { // local variable
		// System.out.println(speed); // we are printing the value of the local variable
		// we passed while calling the
		// method
		// System.out.println(this.speed); // we are printing the value of the speed
		// that object has
		if (speed >= 0)
			this.speed = speed;
		else
			System.out.println("Invalid speed to set");

	}

	// behavior
	public void start() {
		// System.out.println("started! and initial speed is " + this.speed);
		System.out.println("Bike Created!");
	}

	public void increaseSpeed(int increaseSpeedBy) {
		this.setSpeed(this.speed + increaseSpeedBy);
	}

	public void decreaseSpeed(int decraseSpeedBy) {
		this.setSpeed(this.getSpeed() - decraseSpeedBy);
	}

}
