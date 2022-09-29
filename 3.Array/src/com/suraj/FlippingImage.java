package com.suraj;

import java.util.Arrays;

//832. Flipping an Image
//https://leetcode.com/problems/flipping-an-image/
public class FlippingImage {
    public static void main(String[] args){
    /*
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     */

        int[][]image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int [][] ans = flipInvert(image);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }

    static int[] flip(int [] arr){
        int[] ans = new int[arr.length];
        for(int i= 0, j=arr.length-1; i<arr.length; i++, j--){
            ans[j] = arr[i];
        }
        return ans;
    }

    static int[] invert(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        return arr;
    }

    static int[][] flipInvert(int[][] arr){
        for (int i =0; i<arr.length; i++){
            arr[i] = flip(arr[i]);
            arr[i] = invert(arr[i]);
        }
        return arr;
    }

}
