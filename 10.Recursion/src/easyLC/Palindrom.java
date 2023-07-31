package easyLC;

public class Palindrom {
    public static void main(String[] args) {

        System.out.println(pali(12333121));
    }

    static boolean pali(int n){
        return reverse2(n) == n;
    }
    static int reverse2(int n){
        String num = "";
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            num += Integer.toString(rem);
        }
        int number = Integer.parseInt(num);
        return number;
    }
}
