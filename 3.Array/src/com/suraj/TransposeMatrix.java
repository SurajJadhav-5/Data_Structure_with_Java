package com.suraj;
//https://leetcode.com/problems/transpose-matrix/
//867. Transpose Matrix
public class TransposeMatrix {
    public static void main(String[] args) {
        int [][]arr = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };

        int[][]matrix = transpose(arr);
        for (int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");

        }
    }

    static int[][] transpose(int[][] matrix){
        int[][] arr = new int[matrix[0].length][matrix.length];
        for (int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                arr[j][i] = matrix[i][j];
            }

        }
        return arr;

    }
}
