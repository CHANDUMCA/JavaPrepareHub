package com.sunrizeit.week1.assignment;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + " your age is " + age + " .You are allowed to city. Welcome to Chennai");
    }
}
