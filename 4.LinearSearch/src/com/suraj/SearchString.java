package com.suraj;

public class SearchString {
    public static void main(String[] args) {
        String str = "Suraj";
        char target = 'u';
        System.out.println(linearSearch2(str, target));
    }

    static boolean linearSearch2(String str, int target){
        if(str == null)
            return false;

        for(char x : str.toCharArray()){
            if(x == target)
                return true;
        }
        return false;
    }


    static boolean linearSearch(String str, int target){

        if(str == null)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }
        return false;
    }
}
