package com.sunrizeit.week1;

import java.util.Scanner;

public class Program3_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String Name = sc.next();
        System.out.println("Enter Age : ");
        int age=sc.nextInt();
        System.out.println("Hello " + Name + "! You are " + age + " years old.");

    }
}
