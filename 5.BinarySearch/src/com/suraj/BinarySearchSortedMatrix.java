package com.suraj;

public class BinarySearchSortedMatrix {
    public static void main(String[] args) {

    }
    // search in row provided and columns
    static int[] binarySearch(int[][]arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart )/2;

            if(arr[row][mid] == target)
                return new int[]{row,mid};
            else if(arr[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid-1;
        }
        return new int[]{-1, -1};
    }
}
