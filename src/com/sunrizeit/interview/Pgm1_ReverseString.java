package com.sunrizeit.interview;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pgm1_ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Choose option 1 or 2 or 3 or 4" + " \n Method 1 using predefined" + "\n Method 2.Using Programmatically");
        int option = sc.nextInt();
        if (option == 1) {
            method1(input);
        } else if (option == 2) {
            method2(input);
        } else if ((option == 3)) {
            method3(input);
        } else if (option == 4) {
            method4(option,input);
        }
        else if (option == 5) {
            method5(option,input);
        }

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

    public static void method3(String input) {
        String rev = "";
        for (int i = 0; i < input.length(); i++) {
            rev = input.charAt(i) + rev;
        }
        /*
       We start with an empty string rev.
        - On each loop, we take one character from the original string using charAt().
        - Instead of adding it to the end, we place it in front of the existing rev.
        - This way, the characters are built in reverse order.
        For example, from "Hello" we get "olleH".
       */
    }

    public static void method4(int option ,String input) {
        System.out.println("selected method "+option);
        // Using toCharArray to copy elements
        char[] arr = input.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
    
    //Using streams
    public static void method5(int option, String input) {
    	List<Character> lis=input.chars().mapToObj(c->(char) c).collect(Collectors.toList());
    	System.out.println(lis);
    	Collections.reverse(lis);
    	System.out.println(lis.stream()
    	        .map(String::valueOf)
    	        .collect(Collectors.joining()));
    	
    }
}





