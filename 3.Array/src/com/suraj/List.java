package com.suraj;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
//        Output: [0,4,1,3,2]
        for(int i=0;i<nums.length;i++)
        {
            l.add(index[i],nums[i]);
            System.out.println(l);
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=l.get(i);
        }
//        System.out.println(Arrays.toString(arr));
    }
}
