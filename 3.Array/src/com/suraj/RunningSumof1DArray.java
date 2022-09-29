package com.suraj;

// 1480 : https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumof1DArray {

    public static void main(String[] args) {
        int[]  nums ={3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        // int[] arr = new int[nums.length];
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
            // arr[i] = sum;
            nums[i] = sum;
        }
        return nums;
    }

}
