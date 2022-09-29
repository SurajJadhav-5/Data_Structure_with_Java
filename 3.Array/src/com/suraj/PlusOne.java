package com.suraj;

import java.util.Arrays;

//66. Plus One
//        https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int [] arr){
        double sum = 0;
        double j = arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            double value = Math.pow(10,j);
            sum += value*arr[i];

            System.out.println(sum);
//            System.out.println(i);
//            System.out.println(j);
            j--;
        }
        sum += 1;
//        System.out.println(sum);
        int length = String.valueOf(sum).length();
        for (int i = length-1; i >=0; i--) {
            double digit = sum%10;
            arr[i] = (int) digit;
            sum = sum/10;
//            System.out.println(digit);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
