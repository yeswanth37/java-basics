package com.uknit.basics.introToOOPs;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike();
		MotorBike ducati = new MotorBike();

		honda.start();
		ducati.start();

		honda.speed = 100;
		ducati.speed = 80;

	}

}
