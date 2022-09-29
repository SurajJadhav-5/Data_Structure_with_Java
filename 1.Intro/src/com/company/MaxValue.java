package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {12,45,76,4,3,88};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }
}
