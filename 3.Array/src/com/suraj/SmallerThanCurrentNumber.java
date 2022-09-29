package com.suraj;

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
//        Input: nums = []
//        Output: [4,0,1,1,3]
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length;i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
