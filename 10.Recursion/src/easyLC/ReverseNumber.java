package easyLC;
// can be used in palindrom problem
public class ReverseNumber {
    public static void main(String[] args) {
        reverse2(12345);
        System.out.println(num);
    }
    static String num = "";
    static void reverse(int n){

        int rem = n%10;
        num += Integer.toString(rem);
        if (n < 10  ){
            return;
        }
        reverse(n/10);
    }

    static void reverse2(int n){
        String num = "";
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            num += Integer.toString(rem);
        }
        System.out.println(Integer.parseInt(num));
    }

}
