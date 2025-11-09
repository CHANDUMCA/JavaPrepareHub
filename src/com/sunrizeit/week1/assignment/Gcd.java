package com.sunrizeit.week1.assignment;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Program for greatest common divisor (GCD).");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = sc.nextInt();
        int min = num1 < num2 ? num1 : num2;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 & num2 % i == 0) {
                gcd = i;
                System.out.println("inside loop "+gcd);
            }
        }
        System.out.println("final gcd : "+gcd);
    }
}
