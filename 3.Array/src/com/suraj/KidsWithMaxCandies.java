package com.suraj;

import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies/
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public class KidsWithMaxCandies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(arr, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        List<Boolean> arr = new ArrayList<Boolean>();
        for (int i=0; i< candies.length; i++){
            if(candies[i]+extraCandies >= max)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;

    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }


}
