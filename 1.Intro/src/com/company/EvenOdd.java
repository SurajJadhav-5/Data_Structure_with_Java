package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.next();
        System.out.println("Hello "+ name);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        if(num1 %2 ==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
