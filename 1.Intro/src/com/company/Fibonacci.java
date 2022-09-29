package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max number");
        int max = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(c<max){

            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
