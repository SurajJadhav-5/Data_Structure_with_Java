package com.suraj;

public class EvenDigits {
    public static void main(String[] args) {
        int[]arr ={12,4,456,45,4567, 235689,231,654,-65,00};

        int ans = findEvenDigits(arr);
//        int digits = (int)(Math.log10(1)+1);

//        System.out.println(digits%2);
        System.out.println(ans);

    }

    static int findEvenDigits(int[]arr){
        int count = 0;
        for(int ele: arr){
            if(ele <= 0)
                ele*=-1;
            String str = String.valueOf(ele);
            if(str.length()%2 ==0)
                count++;

        }
        return count;
    }

    static int findEvenDigits2(int[]arr){
        int count =0;
        for(int ele: arr){
            int digits = (int)(Math.log10(ele)+1);
            if(digits%2==0)
                count++;
        }
        return count;
    }
}
