package easyLC;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact1(5));
    }
    static int fact1(int n){
        if (n == 1){
            return 1;
        }
        int res = n * fact1(n-1);
        return res;
    }
}
