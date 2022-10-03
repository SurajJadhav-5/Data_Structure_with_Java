package com.suraj;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {12,34,56,3,68,665,9,559};
        int target = 324;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //search element and return index
    static int linearSearch(int[] arr, int target){
        if(arr==null)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)

                return i;
        }
        return -1;
    }

}
