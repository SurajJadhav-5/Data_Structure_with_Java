package com.suraj;

import java.util.Arrays;

//26 https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
//        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));

    }

    static int removeDuplicates(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i] == nums[i+1]){
                count++;
            }
            nums[i + 1 - count] = nums[i+1];
        }
        return nums.length - count;
    }

}
