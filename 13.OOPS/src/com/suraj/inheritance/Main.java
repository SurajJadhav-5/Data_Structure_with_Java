package com.suraj.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.l+" "+box1.w+" "+ box1.h);
//
//        Box box2 = new Box(5);
//        System.out.println(box2.l+" "+box2.w+" "+ box2.h);
//
//        Box box3 = new Box(2, 4, 7);
//        System.out.println(box3.l+" "+box3.w+" "+ box3.h);
//
//        Box box4 = new Box(box3);
//        System.out.println(box4.l+" "+box4.w+" "+ box4.h);

//        BoxWeight box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.l+" "+ box5.weight);

        // you can use constructor of child class referring to parent class
        // All child class parameter can be initialised but only parent parameters are accessible
        // vice versa is not true
        Box box6 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box6.w);



    }


}
