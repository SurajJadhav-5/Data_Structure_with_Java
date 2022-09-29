package com.suraj;

//1832. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String str = "rge";
        boolean ans = pangram(str);
        System.out.println(ans);
    }

    static boolean pangram(String sentence) {
        Set<Character> set = new HashSet<Character>();
        if (sentence.length() >= 26) {
            for (int ch = 0; ch < sentence.length(); ch++) {
                set.add(sentence.charAt(ch));
            }
//            System.out.println(set);
    }
        return (set.size()==26);
}
}
