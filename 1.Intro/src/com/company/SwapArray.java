package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {12,45,76,4,3,88};
//        swap(arr, 1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
