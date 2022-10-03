package com.suraj;

import javax.swing.plaf.basic.BasicIconFactory;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//989. Add to Array-Form of Integer
//https://leetcode.com/problems/add-to-array-form-of-integer/
public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        addToArrayForm(num, k);

    }

    static void addToArrayForm(int[] num, int k) {
        long sum = 0;
        for (int i = 0,j=num.length-1; i < num.length; i++, j--) {
            sum += num[i]*Math.pow(10,j);
        }
        System.out.println(sum);
        sum += k;
        System.out.println(sum);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (sum > 0){
            long digit = sum%10;
            list.add(0, (int) digit);
            sum /= 10;
        }
        System.out.println(list);
    }


    static ArrayList<Integer> fun(int[]num, int k){
        int n =num.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=n-1; i>=0; i--){

            int sum = num[i]+k;
            num[i]= sum%10;
            k=sum/10;
            ans.add(num[i]);

        }

        while(k>0){
            ans.add(k%10);
            k/=10;
        }

        Collections.reverse(ans);
        return ans;
    }
    }

