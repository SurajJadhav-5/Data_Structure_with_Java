package easyLC;

public class CountZeros {
    public static void main(String[] args){
        System.out.println(count(1100));
    }
    // if you dont want to create a varibale outside the fun creatte new fun
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n, int i) {
        if (n == 0) {
            return i;
        }
        if (n%10 == 0){
            return helper(n/10, i+1);
        }
        return  helper(n/10, i);
    }

    //    static int cnt = 0;
//    static void count(int n){
//        if (n < 10 && n == 0){
//            cnt++;return;
//        }
//        if (n < 10 && n != 0){
//            return;
//        }
//        if (n%10 == 0){
//            cnt++;
//        }
//        count(n/10);
//    }
}
