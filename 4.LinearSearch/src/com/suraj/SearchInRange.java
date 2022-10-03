package com.suraj;

public class SearchInRange {
    public static void main(String[] args) {
        String str = "Suraj Jadhav";
        char c = 'd';

        int[] arr = {12,45,74,686,434,79,90,34};
        int i = 686;
        int start = 0;
        int end = 30;
//        System.out.println(searchInRangeString(str, c, start, end));
        System.out.println(searchInRangeArray(arr, i, 0, 4));
    }

    static boolean searchInRangeString(String str, char target, int start, int end){
        if(str.length()==0)
            return false;

        if(start > end || start>str.length() || start <0){
            System.out.println("Enter valid range");
            return false;
        }

        for (int i= start; i <=end; i++) {
            if(target==str.charAt(i))
                return true;
        }
        return false;
    }

    static boolean searchInRangeArray(int[] arr, int target, int start, int end){
        if(arr==null)
            return false;

        if(start > end || start>arr.length || start <0){
            System.out.println("Enter valid range");
            return false;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target)
                return true;
        }
        return false;
    }
}
