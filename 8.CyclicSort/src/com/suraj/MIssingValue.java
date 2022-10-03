package com.suraj;

import java.util.Arrays;

public class MIssingValue {
    public static void main(String[] args) {
        int [] arr = { 9,6,4,2,3,5,7,0,1};

        System.out.println(missingValue(arr));
    }

    static int missingValue(int[] nums){
        int i = 0;
        while (i<nums.length){
            if(nums[i] == nums.length)
                i++;
            else if (nums[i] != i){
                swap(nums, nums[i], i);
            }
            else
                i++;
        }
        int index = nums.length;
        for(int j =0; j < nums.length; j++){
            if(nums[j] != j)
                index = j;
        }
        return index;
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
