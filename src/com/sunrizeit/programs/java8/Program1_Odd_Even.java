package com.sunrizeit.programs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program1_Odd_Even {
	static List<Integer> number = new ArrayList<>();
	static List<Integer> even = new ArrayList<>();
	static List<Integer> odd = new ArrayList<>();

	public static void main(String[] args) {

		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give input number upto numbers");
		input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			number.add(i);
		}
		System.out.println("List of input numbers: " + number);
		int inputmethod = 0;
		System.out.println("Choose the option in which way you want.\n 1. Traditional \n 2. Java8");
		inputmethod = sc.nextInt();
		if (inputmethod==1) {
			loopmethod(number);
		}
		if (inputmethod==2) {
			usingStreams(number);
		}

	}

	private static void loopmethod(List<Integer> number) {
		int size = number.size();
		int out = 0;
		for (int j = 0; j < size; j++) {
			if (number.get(j) % 2 == 0) {
				even.add(number.get(j));
			} else {
				odd.add(number.get(j));
			}
		}

		System.out.println("Even numbers: " + even);
		System.out.println("odd numbers: " + odd);

	}

	private static void usingStreams(List<Integer> number) {
		Map<Boolean, List<Integer>> partitioned=number.stream().collect(Collectors.partitioningBy(n->n%2==0));
		even=partitioned.get(true);
		odd=partitioned.get(false);
		System.out.println("java 8 even :"+even);
		System.out.println("java 8 even :"+odd);

	}

}
