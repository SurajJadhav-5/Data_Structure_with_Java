package com.suraj.abstractDemo;

public class Son extends Parent {


    // abstract methods must br overridden
    @Override
    void  name(){
        System.out.println("My name is Suraj.");
    }

    @Override
    void age(){
        System.out.println("My age is 22.");
    }

}
