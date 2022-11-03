package com.suraj.polymorphism;

public class Shape {
    Shape(){

    }

    void intro(){
        System.out.println("Hello from Shape Class");
    }

    void fun1(int a){
        System.out.println("Funtion with 1 int Parameter");
    }
    void fun1(double a){
        System.out.println("Funtion with 1 double Parameter");
    }
    void fun1(int a, int b){
        System.out.println("Funtion with 2 int Parameter");
    }
}
