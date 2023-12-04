package com.uknit.basics.introToOOPs;

public class Book {

	// state
	private int noOfCopies;

	// constructor
	public Book() {
		System.out.println("Book is created!");
	}

	// getters and setters
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	// behavior

	// override toString()
	@Override
	public String toString() {
		return "No of Copies: [" + this.noOfCopies + "]";
	}
}
