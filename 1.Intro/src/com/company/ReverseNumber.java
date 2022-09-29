package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String reverse = "";
        while(num>0){
            int rem = num%10;
            reverse += rem;
            num /= 10;
        }
        int r = Integer.parseInt(reverse);
        System.out.println(r);
    }
}
