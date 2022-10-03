package com.suraj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pattern7(5);
    }

    /* pattern2
             *
             **
             ***
             ****
             *****
     */

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j<= row ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    /* pattern 1
     *****
     *****
     *****
     *****
     *****
     */
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j<= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern3
            *****
            ****
            ***
            **
            *
     */

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j<=n-row+1 ; j++) { //for (int j = n-row+1; j>0 ; j--)
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*  pattern 4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j<=row ; j++) { //for (int j = n-row+1; j>0 ; j--)
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* pattern 5
             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *
     */
   static void pattern5(int n){
       for (int i = 1; i <=2*n; i++) {
           int col = i > n ? 2*n -i : i;
//           int col = i;
//           if(i > n)
//               col = 2*n - i;
           for (int j = 1; j <= col; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }

   static void pattern6(int n){
       for (int i = 0; i < n ; i++) {
           for (int j = 0; j < n-i; j++) {
               System.out.print(" ");
           }
           for (int j = 0; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }

   static void pattern7(int n){
       for(int i = 0; i < n; i++){
           for(int j = 0; j < i; j++){
               System.out.print(" ");
           }
           for(int j = 0; j < n-i; j++){
               System.out.print("*");
           }

           System.out.println();
       }
   }

   static void pattern8(int n){

   }



}
