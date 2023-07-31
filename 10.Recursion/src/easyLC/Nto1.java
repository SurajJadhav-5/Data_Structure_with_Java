package easyLC;

public class Nto1 {
    public static void main(String[] args){
        int n = 7;
        printN2(n);
    }

    static void printn(int n){
        System.out.println(n);
        if (n == 1){
            return;
        }
        printn(n-1);
    }

    static void printN2(int n){
        System.out.println(n);
        if (n == 1){
            return;
        }
        //printN2(n--); -> first pass the value the resduce
        printN2(--n);   // first redce the value then pass


    }
}
