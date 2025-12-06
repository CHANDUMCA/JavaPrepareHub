package com.sunrizeit.interview;

import java.util.Scanner;

public class Pgm3_StringRemoveSpace {

	public static void main(String[] args) {
		System.out.println("Program to reverse a String");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"This ouput we can achieve different ways :\n 1.Using program \n 2.Using stream \n 3.Using stream \n Choose the option from the above : ");
		int select = sc.nextInt();
		sc.nextLine();
		switch (select) {
		case 1: {
			System.out.println("Enter your input : ");
			String input = sc.nextLine();
			String output = input.replace(" ", "");
			System.out.println("output : " + output);
			sc.close();
			break;
		}
		case 2: {
			System.out.println("its in development");
			break;
		}
		default:
			System.out.println("Invalid option");
			break;

		}

	}

}
