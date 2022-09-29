package com.suraj;
//1732. Find the Highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args){
//        Input: gain = [-5,1,5,0,-7]
//        Output: 1
//        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//        Input: gain = [-4,-3,-2,-1,4,3,2]
//        Output: 0
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(highestGain(gain));
    }

    static int highestGain(int[] gain){
        int high = 0;
        int max = high;
        for (int i = 0; i< gain.length; i++){
            high += gain[i];
            if(high>max)
                max = high;
        }
        return max;
    }
}
