package com.uknit.basics.introToOOPs.datatypes;

public class BiNumber {

	// state
	private int a;
	private int b;

	// parameterized constructor
	public BiNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// getters
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	// behavior

	// return the sum of two numbers
	public int add() {
		return a + b;
	}

	// return the multiplied value of two numbers
	public int multiply() {
		return a * b;
	}

	// print the double values of both numbers
	public void printDoubleValues() {
		System.out.printf("a : %d doubled is %d and b : %d doubled is %d ", a, (2 * a), b, (b * 2)).println();
		this.a = 2 * a;
		this.b = 2 * b;
	}
}
