package com.suraj;

// 1217 https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinimumCost {
    public static void main(String[] args) {
        int[] arr ={ 2,2,2,3,3};
        System.out.println(minimumCost(arr));

    }

    static int minimumCost(int[]position){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {

            if(position[i]%2 == 0)
                odd++;
            else
                even++;
        }
        return Math.min(odd, even);
    }
}
