package com.suraj.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // every time same instance is returning so all three are pointing to same object
    }
}
