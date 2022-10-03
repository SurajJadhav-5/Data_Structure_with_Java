package com.suraj;

public class minimumInArray {
    public static void main(String[] args) {
        int[] arr = {12,57,42,78,-9,1, 3445};

        System.out.println(max(arr));

    }
    // assume array is not empty
    // check all edge cases while solving problems
    static int min(int[] arr){

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans)
                ans = arr[i];

        }
        return ans;
    }

    static int max(int[] arr){

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>ans)
                ans = arr[i];

        }
        return ans;
    }
}
