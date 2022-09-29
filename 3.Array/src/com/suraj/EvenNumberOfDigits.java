package com.suraj;

public class EvenNumberOfDigits {
    public static void main(String[] args) {

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i= 0; i<nums.length; i++){
            String str = Integer.toString(nums[i]);
            if(str.length()%2 == 0)
                count++;
        }
        return count;
    }

    static int findNumbers2(int[] nums){
        int count = 0;
        for (int num: nums){
            int digits = 0;
            while (num > 0){
                num = num/10;
                digits++;
            }
            if(digits%2==0)
                count++;
        }
        return count;
    }
}

