package com.uknit.basics;

import java.util.Scanner;

public class ConvertFwdToBkdSlash {

	public static void main(String[] args) {

		String input;
		System.out.println("Enter the input string : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		String result = convertFwdToBwdSlash(input);
		System.out.println(result);

	}

	private static String convertFwdToBwdSlash(String input) {

		return input.replace('\\', '/');
	}

}
