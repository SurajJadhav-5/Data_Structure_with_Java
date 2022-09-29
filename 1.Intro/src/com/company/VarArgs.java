package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun1(1,2,3,4);      // variable arguments
        fun(2,3,4,5,6,7,8,9,0); // fixed and variable arguments
    }

    static void fun1(int ...x){
        System.out.println(Arrays.toString(x));
    }

    private static void fun(int a, int b, int ...c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
