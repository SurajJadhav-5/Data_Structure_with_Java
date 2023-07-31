package easyLC;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(product(1110));

    }
    static int fun(int n){
        int rem = n%10;
        if (n < 10){
            return n;
        }
        return rem+ fun(Math.floorDiv(n,10));

    }
    static int product(int n){
        int rem = n%10;
        if (n < 10){
            return n;
        }
        return rem * product(Math.floorDiv(n,10));

    }
}
