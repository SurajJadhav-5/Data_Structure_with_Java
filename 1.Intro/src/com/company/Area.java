package com.company;

import java.util.Scanner;

public class Area{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(circle());
    }

    static float traingle(){
        System.out.println("Enter length and breadth");
        int height = in.nextInt();
        int breadth = in.nextInt();

        return height*breadth/2;
    }

    static float rectangle(){
        System.out.println("Enter length and breadth");
        int length = in.nextInt();
        int breadth = in.nextInt();

        return length*breadth;

    }

    static float circle(){
        System.out.println("Enter radius");
        int radius = in.nextInt();
        return 22.0f/7*(radius*radius);
    }



}
