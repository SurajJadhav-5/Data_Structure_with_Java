package com.suraj;

public class swap {
    public static void main(String[] args) {
        int a = 34;
        int b = 56;
//        swap(a, b);
        System.out.println(a +" " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" " + b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a +" " + b);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
