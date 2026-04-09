package com.sunrizeit.week1.assignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number ");
		int input = sc.nextInt();
		boolean isprime = true;
		if (input < 2) {
			isprime = false;
		}
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println("prome");
		} else {
			System.out.println("not a prime");
		}

	}
}
