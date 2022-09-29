package com.suraj;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter MRP");
        int mrp = in.nextInt();
        System.out.println("Enter Discount");
        int dis = in.nextInt();
        System.out.println(actualPrice(mrp,dis));

    }
    static int actualPrice(int mrp, int dis){
        int actualPrice = mrp - (mrp*dis/100);
        return actualPrice;
    }
}
