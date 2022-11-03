package com.suraj.singleton;

public class Singleton {
    private Singleton(){}

    private static Singleton instance;
    public static Singleton getInstance(){
        // check if instance is null if yes then create one
        if(instance == null)
            instance = new Singleton();

        // it will return the same instance every time.
        return instance;

    }
}
