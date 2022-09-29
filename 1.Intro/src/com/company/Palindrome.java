package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();
        int length = str.length();
        String reverse = "";
        for (int i= length-1; i>=0; i--){
            reverse =  reverse + str.charAt(i);
        }
        if(str.equals(reverse))
            System.out.println("True");
        else
            System.out.println("False");


    }
}
