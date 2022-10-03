package com.suraj;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.Arrays;

public class NumersDisappeared {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<Integer>();

        list = findDisappearedNumbers(nums);
        System.out.println(list);

    }

    static ArrayList<Integer> findDisappearedNumbers(int [] nums){
        int i = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int correct = i+1;
        while (i < nums.length){
            if(nums[i] != i+1){
                swap(nums, i, nums[i]-1);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+ 1)
                list.add(j+1);
        }
//        System.out.println(list);
        return list;
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
