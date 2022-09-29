package com.suraj;

import java.util.ArrayList;
import java.util.Arrays;

//1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class TargetArrayGivenOrder {
    public static void main(String[] args) {
//       int[] nums = {0,1,2,3,4};
//       int[] index = {0,1,2,2,1};
//        Output: [0,4,1,3,2]


//
        int[] nums = {4,2,1,1};
        int[] index = {0,0,2,0};
//        Output: [1241]

        System.out.println(Arrays.toString(createTargetArray2(nums, index)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int ind = index[i];

            if(ind < i){
                int j = i;
                while(j>ind){
                    target[j] = target[j-1];
                    target[j-1] = nums[i];
                    j--;
                }
            }
            else
                target[i] = nums[ind];

        }
        return target;
    }

    static int[] createTargetArray2(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i= 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        for (int i=0; i<nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
