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
		if (noOfCopies >= 0)
			this.noOfCopies = noOfCopies;
		else
			System.out.println("No of Copies cannot be updated! Please check");
	}

	// behavior
	public void increaseNoOfCopies(int increaseBy) {
		setNoOfCopies(noOfCopies + increaseBy);
	}

	public void decreaseNoOfCopies(int decreaseBy) {
		setNoOfCopies(noOfCopies - decreaseBy);
	}

	// override toString()
	@Override
	public String toString() {
		return "No of Copies: [" + this.noOfCopies + "]";
	}
}
