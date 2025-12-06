package com.sunrizeit.interview;

import java.util.Collections;
import java.util.Scanner;

import java.util.stream.Collectors;

public class Pgm1_ReverseString {
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Choose option 1 or 2 or 3 or 4" + ""
				+ " \n Method 1 using predefined 		(StringBuilder)"
				+ "\n Method 2.Using Programmatically 	(using for loop)"
				+ "\n Method 3.Using toCharArray to copy elements"
				+ "\n Method 4.Using streams");
		int option = sc.nextInt();
		if (option == 1) {
			method1(input);
		} else if (option == 2) {
			method2(input);
		} else if (option == 3) {
			method3(option, input);
		} else if (option == 4) {
			method4(option, input);
		}
		sc.close();

	}

	private static void method1(String input) {
		StringBuilder output = new StringBuilder(input).reverse();
		System.out.println(output);
	}

	public static void method2(String input) {
		int length = input.length();
		String rev = "";
		for (int le = length - 1; le >= 0; le--) {
			rev += input.charAt(le);
		}
		System.out.println(rev);
	}

	public static void method3(int option, String input) {
		System.out.println("selected method " + option);// Using toCharArray to copy elements
		char[] arr = input.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);
	}

	// Using streams
	public static void method4(int option, String input) {
		System.out.println("using method streams "+option);
		String reversedStream = input.chars()		// Create an IntStream of characters
				.mapToObj(c -> (char) c) 			// Convert int to Character
				.collect(Collectors.toList()) 		// Collect characters into a list
				.stream() 							// Create a stream again
	            .sorted(Collections.reverseOrder()) // Reverse the order of the stream
				.map(String::valueOf) 				// Convert each character to a string
				.collect(Collectors.joining());		// Join them back together into a single string
		System.out.println(reversedStream);			// Output: 

	}
	
}
