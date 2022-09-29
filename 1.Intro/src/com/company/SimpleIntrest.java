package com.company;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long p = input.nextInt();
        int n = input.nextInt();
        float r = input.nextFloat();
        double si = p*n*r/100;
        System.out.println("Simple Interest = "+ si);
    }
}
