package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();
        int n = num;
        int rem = 0;
        int sum = 0;
        while (num > 0)
        {
            rem = num%10;
            sum += rem*rem*rem;
            num = num/10;
        }

        if(sum == n)
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println(sum);
    }
}
