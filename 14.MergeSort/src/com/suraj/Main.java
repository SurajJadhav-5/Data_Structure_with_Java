package com.suraj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 2, 5, 5};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));

    }

    private static int[] mergeSort(int[] arr){
        if(arr.length== 1)
            return arr;

        int mid = arr.length / 2;

        // divide array into 2
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // merge while sorting
        while (i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }


        // if one array is shorter than other
        while (i < first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
