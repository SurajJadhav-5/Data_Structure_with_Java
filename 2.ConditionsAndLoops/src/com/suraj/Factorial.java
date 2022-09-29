package com.suraj;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Factorial : " + fact(n));

        }
    static int fact(int num){
        int f = 1;
        for(int i=1; i<=num; i++){
            f *= i;
        }
        return f;
    }
}
