package com.suraj;

//https://leetcode.com/problems/missing-number/
//268. Missing Number

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int [] arr = {3, 5, 2, 1, 4, 6, 8, 7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while (i< arr.length){
            if(arr[i] == i+1){
                i++;
            }
            else{
                swap(arr, i, arr[i]-1);
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
