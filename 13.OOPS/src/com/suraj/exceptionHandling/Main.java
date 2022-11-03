package com.suraj.exceptionHandling;

public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        // Method 1
        try{
//            System.out.println(divide(a, b));
            System.out.println(divide2(a, b));
        } catch(Exception x){
            System.out.println(x.getMessage());
        }

        // Using own exception
        try{
            String name = "Suraj";
            if(name.equals("Suraj"))
                throw new MyException(" Name is Suraj");
        } catch (MyException e){
            System.out.println(e.getMessage());

        }


    }
    private static int divide(int a, int b){
        return a/b;
    }

    // Method 2
    private static int divide2(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        return a/b;
    }
}
