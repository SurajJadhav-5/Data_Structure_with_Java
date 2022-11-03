package com.suraj;

import java.util.ArrayList;
import java.util.Arrays;

//66. Plus One
//        https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
//        plusOne(arr);
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] digits2 = new int[digits.length+1];
        digits2[0] = 1;
        return digits2;
    }
}


/*
int len=digits.length;
       for(int i=len-1;i>=0;i--){
           if(digits[i]<9){
               digits[i]++;
               return digits;
           }
           digits[i]=0;
       }
        int[] newArr=new int[len+1];
        newArr[0]=1;
        return newArr;
    }
 */