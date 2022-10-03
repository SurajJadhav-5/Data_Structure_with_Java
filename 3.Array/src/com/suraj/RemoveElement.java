package com.suraj;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
//27. Remove Element
public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(Arrays.toString(removeElement(nums, val)));
    }

    static int[] removeElement(int [] nums, int val){
        int i = 0;
        int swapped = nums.length-1;
        int swapCount = 0;
        while (i < nums.length){
            if(nums[i] == val){
                nums[i] = -1;
                swap(nums, i, swapped-swapCount);
                swapCount++;
            }
            else
                i++;
        }
        System.out.println(nums.length-swapCount);
        return nums;
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
