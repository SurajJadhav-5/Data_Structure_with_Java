package com.suraj.abstractDemo;

public class Daughter extends Parent{

    // abstract methods must be overridden
    @Override
    void name() {
        System.out.println("My name is Sanjana.");
    }

    @Override
    void age() {
        System.out.println("My age is 30.");

    }
}
