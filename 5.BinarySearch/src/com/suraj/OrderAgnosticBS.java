package com.suraj;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = {12,45,64,85,88,89,90,95};
        int[] arrDes = {98,71,68,64,50,41,22};
        int target = 64;
        int ans = binarySearch(arrDes, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if(isAsc){
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else
            {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
