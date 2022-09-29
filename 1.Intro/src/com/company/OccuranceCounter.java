package com.company;

import java.util.Scanner;

public class OccuranceCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("Enter the digit to be counted");
        int digit = in.nextInt();
        int rem = 0;
        int count = 0;
        while(num > 0)
        {
            rem = num%10;
            if(rem == digit)
                count++;
            num = num /10;
        }
        System.out.println("Count : " + count);
    }
}
