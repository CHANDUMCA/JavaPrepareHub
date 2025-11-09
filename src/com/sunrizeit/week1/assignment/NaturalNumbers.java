package com.sunrizeit.week1.assignment;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NaturalNumbers {
    static Scanner sc = new Scanner(System.in);
    static int input = 0;
    static int output = 0;
    static int sum = 0;


    public static void main(String[] args) {

        while (true) {
            getnaturalnumber();
            System.out.println("Do you want to try more natural numbers sum ? Y/N");
            String req = sc.next();

            if (req.equalsIgnoreCase("Y")) {
                getnaturalnumber();
                continue;
            } else if (req.equalsIgnoreCase("N")) {
                System.out.println("Thank you for using our Application");
                break;
            } else {
                System.out.println("Invalid choice. Please enter Y or N.");
                continue; // Repeat the prompt again if the input is invalid
            }

        }

    }

    static void getnaturalnumber() {

        System.out.println("Program to print sum of natural numbers");
        System.out.println("------------------------------------------");
        System.out.println("This one we can achieve in three different approaches" + "\n1. By using Mathematical way"
                + "\n2. By using Programmatic way"
                + "\n3.Using java 8 streams"
                +"\nChoose 1 or 2 or 3");
        int ways = 0;
        ways = sc.nextInt();

        if (ways == 1) {
            System.out.println("selected Mathematical way");
            sum = naturalmethod1();
        } else if (ways == 2) {
            sum = 0;
            System.out.println("selected Programmatically way ");
            sum = naturalmethod2();
        } else if (ways==3) {
            sum=0;
            System.out.println("selected using java 8 streams ");
            sum=streamssum();
            System.out.println(sum);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2 or 3.");
            return;  // Exit the program if invalid input is given
        }
        System.out.println("The sum of the first " + input + " natural numbers is: " + sum);
    }

    static int naturalmethod1() {
        System.out.print("Enter Number up to natural number you required ");
        input = sc.nextInt();
        return input * (input + 1) / 2;
    }

    static int naturalmethod2() {
        System.out.print("Enter Number up to natural number you required ");
        input = sc.nextInt();
        int localSum = 0;
        for (int i = 1; i <= input; i++) {
            localSum = localSum + i;
        }
        return localSum;
    }
    static int streamssum(){
        System.out.print("Enter Number up to natural number you required ");
        int end=sc.nextInt();
        int sum= IntStream.rangeClosed(1,end).sum();
        return sum;
    }
}
