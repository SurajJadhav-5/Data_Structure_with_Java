package com.suraj.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.name();
        Daughter daughter = new Daughter();
        daughter.name();
//        Parent parent = new Parent(); // cannot instantiate abstract class
//        parent.greeting();
    }
}
