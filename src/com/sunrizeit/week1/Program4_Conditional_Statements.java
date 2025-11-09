package com.sunrizeit.week1;

import java.util.Scanner;

public class Program4_Conditional_Statements {
    static int marks = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //if / else / else if
        System.out.println("Program for Conditional Statements");
//        90	Grade: A
//        75	Grade: B
//        50	Grade: B
//        Grade: F
        result();
        System.out.println("Do you want try again Y/N");
        String input = "";
        input = sc.next();
        if (input.equalsIgnoreCase("Y")) {
            result();
        }else System.out.println("Thank for visiting our website");
    }

    static void result() {
        System.out.print("Enter marks : ");
        marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Grade: A");
        } else if (marks > 75) {
            System.out.println("Grade: B");
        } else if (marks > 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
    }

}
