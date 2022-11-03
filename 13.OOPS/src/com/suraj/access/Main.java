package com.suraj.access;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A(5, "Suraj");
//        System.out.println(obj1.num); //private inaccessible
        System.out.println(obj1.name); // public accessible

        // using getter and setter for accessing private data member
        System.out.println(obj1.getNum());
        obj1.setNum(19);
        System.out.println(obj1.getNum());



    }

}
