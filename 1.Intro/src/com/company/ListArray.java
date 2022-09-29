package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int x = in.nextInt();
            list.add(x);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // i- index

        }
    }
}
