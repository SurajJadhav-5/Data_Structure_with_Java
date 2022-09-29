package com.suraj;

import java.util.Arrays;

//1470 : https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[]nums, int n){
//        When 2*n is used i got 13% faster on leetcode but when i used num.length(inbuild function) i got 70% faster code
        // try to use inbuild function
//        int[] arr = new int[2*n];

        int[] arr = new int[nums.length];

//        you can initilize multiple variable in for loop
        for (int i=0,j=0;i<n;i++,j+=2){
            arr[j] = nums[i];
            arr[j+1]= nums[i+n];
//            j+=2;
        }
        return arr;

    }
}
