package com.suraj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // iternal sort
    }

    private static void quickSort(int[] arr, int low, int high){
        if(low >= high)
            return;

        int s = low;
        int e = high;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while (s <= e){
            while (arr[s] < pivot)
                s++;

            while (arr[e] > pivot)
                e--;

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            // pivot is at correct index sort other halfs

            quickSort(arr, low, e);
            quickSort(arr, s, high);

        }
    }
}
