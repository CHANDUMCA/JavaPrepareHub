package com.sunrizeit.week1.assignment;

import java.util.Scanner;

public class EvenOdd {
    static Scanner sc = new Scanner(System.in);
    static int input = 0;

    public static void main(String[] args) {
        System.out.println("Program to find even or odd");
        result();
    }

    static void result() {
        System.out.print("Enter number : ");
        input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is odd");
        }
        System.out.println("Do you want to try another Number: Y/N");
        String uinput="";
        uinput= sc.next();
        if(uinput.equalsIgnoreCase("Y")){
            result();
        }
        else if(uinput.equalsIgnoreCase("N")){
            System.out.println("Thank you for using our program");
        }else{
            System.out.println("Given wrong input");
        }





    }

}
