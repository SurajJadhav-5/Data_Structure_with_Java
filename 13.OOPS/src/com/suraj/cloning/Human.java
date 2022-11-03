package com.suraj.cloning;

public class Human implements Cloneable{

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }


    //object cloning constructor

    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        return super.clone();
    }
}
