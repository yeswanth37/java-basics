package com.uknit.basics.introToOOPs;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		// Here the code and the data are not binded properly breaking encapsulation
		// NO class should directly access the member variables and should only access
		// through getters and setters
//		artOfComputerProgramming.noOfCopies = 20;
//		effectiveJava.noOfCopies = 50;
//		cleanCode.noOfCopies = 100;

		// setting member variables through setters instead of directly accessing them
		artOfComputerProgramming.setNoOfCopies(20);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(100);

		// getting values for member variables through getters
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		// System.out.println(effectiveJava.getNoOfCopies());
		// System.out.println(cleanCode.getNoOfCopies());

		// System.out.println(artOfComputerProgramming);

		artOfComputerProgramming.increaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies()); // 120
		artOfComputerProgramming.decreaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies()); // 20

	}

}
