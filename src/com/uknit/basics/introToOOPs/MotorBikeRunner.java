package com.uknit.basics.introToOOPs;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike();
		MotorBike ducati = new MotorBike();

		honda.start();
		ducati.start();

		// ** Encapsulation
		// Other classes shouldn't change the data of another class's object directly
		// Encapsulation: code and data are binded together in such a way that no
		// external class can directly access them
		// the way to encapsulate data is to make variables private and access them
		// through getters and setters methods
		// honda.speed = 100;
		// ducati.speed = 80;

		honda.setSpeed(80);
		// ducati.setSpeed(100);

		System.out.println(honda.getSpeed());
		// System.out.println(ducati.getSpeed());

		honda.increaseSpeed(20);

		// 2nd level of Encapsulation
		// Here the logic to increase speed in this class is not an ideal way to change
		// the speed
		// any logic changing the state of an object should only be available in the
		// member class
		//
		/*
		 * int ducatiSpeed = ducati.getSpeed(); ducatiSpeed += 20;
		 * ducati.setSpeed(ducatiSpeed);
		 */

		System.out.println(honda.getSpeed());

		honda.decreaseSpeed(100);

		System.out.println(honda.getSpeed());

	}

}
