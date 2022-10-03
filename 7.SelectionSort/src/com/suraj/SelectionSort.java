package com.suraj;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
	    int [] arr = {0};
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr,0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int getMax(int [] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }


}
