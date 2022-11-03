package com.suraj;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {-1, -1, 4, 9, 12, 36, 48, 50};
        int target = -1;
//        int start = 0;
//        int end = arr.length-1;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));

    }

    static int binarySearch(int [] arr, int target, int start, int end){

        int mid = start + (end - start)/2;

        if(start > end)
            return -1;

        if(arr[mid] == target){
//            System.out.println(mid);
            return mid;
            }
        else if(arr[mid]<target)
            return binarySearch(arr, target, mid+1, end);
        else
            return binarySearch(arr, target, start, mid-1);

    }
}
