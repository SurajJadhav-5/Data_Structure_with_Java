package com.suraj;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-12, -4, 0, 34, 65, 67, 78, 87, 88, 89, 99, 134};
        int target = 0;
        System.out.println("Search");
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return -1;
    }
}
