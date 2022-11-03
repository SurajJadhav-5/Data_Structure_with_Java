package com.suraj;

import java.util.ArrayList;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        int r = 11;
        int c = 5;
//        Output: [[1,2,3,4]]
        int [][] newMat = matrixReshape(mat, r, c);
        for (int row = 0; row < newMat.length; row++) {
            for (int col = 0; col < newMat[row].length; col++) {
                System.out.print(newMat[row][col]+ " ");
            }
            System.out.println();
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c){

        if( r < 0 || c < 0)
            return mat;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                list.add(mat[row][col]);
//                System.out.println(mat[row][col]);
            }
        }

        if((mat.length * mat[0].length) != (r * c)) return mat;

        System.out.println(list);
        int i = 0;
        int[][] newMat = new int[r][list.size()/r];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < list.size()/r ; col++) {
                newMat[row][col] = list.get(i);
                i++;
                System.out.println(i + " " + list.get(i));
            }
        }

//        for (int row = 0; row < newMat.length; row++) {
//            for (int col = 0; col < newMat[row].length; col++) {
//                System.out.print(newMat[row][col]+ " ");
//            }
//            System.out.println();
//        }
        return newMat;
    }
}
