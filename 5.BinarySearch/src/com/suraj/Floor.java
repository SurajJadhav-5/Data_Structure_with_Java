package com.suraj;

public class Floor {
    public static void main(String [] args){
        int[] nums = { 2, 3, 14, 17, 35};
        int target = 0;
        int ans = floor(nums, target);
        System.out.println(ans);
    }

    static int floor(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==nums[mid])
                return mid;
            else if(target > nums[mid])
                start = mid+1;
            else
                end = mid - 1;
        }
        return end;
    }
}
