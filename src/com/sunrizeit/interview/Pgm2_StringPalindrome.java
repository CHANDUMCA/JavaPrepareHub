package com.sunrizeit.interview;

import java.util.Scanner;

public class Pgm2_StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to check the Given String is plaindrome or not");
		System.out.println("Enter input string : ");
		String input = sc.nextLine();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		if (input.equals(output)) {
			System.out.println("Given input " + input + " is palindrome");
		} else {
			System.out.println("Givne input " + input + " is not palindrome");
		}

	}

}
