package com.suraj;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {34,56},
                {63,69,19,15},
                {28,49,20},
                {12,94}
        };
        
        int target = 384898;
        int[]ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
//        System.out.println(min(arr));
    }
    
    static int[] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[]{row, col};
            }
        }

        return new int[]{-1, -1};
    }

    static int max(int [][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] >max)
                    max = arr[row][col];
            }
        }
        return max;
    }

    static int min(int [][]arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] <min)
                    min = arr[row][col];
            }
        }
        return min;
    }
}
