package com.uknit.basics.introToOOPs.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber biNumObj = new BiNumber(2, 3);

		// get a and b values
		System.out.println("a is " + biNumObj.getA());
		System.out.println("b is " + biNumObj.getB());

		// add()
		int result = biNumObj.add();
		System.out.println("Addition result : " + result);

		// multiply()
		result = biNumObj.multiply();
		System.out.println("Multiplication result : " + result);

		// printDoubleValues()
		biNumObj.printDoubleValues();

		// get a and b values
		System.out.println("a is " + biNumObj.getA());
		System.out.println("b is " + biNumObj.getB());

	}

}
