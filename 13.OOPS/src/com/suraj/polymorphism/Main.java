package com.suraj.polymorphism;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        // this is run time polymorphism
        // method overriding
        shape.intro();
        circle.intro();
        square.intro();

        // this is compile time polymorphism
        // method overloading
        shape.fun1(1);
        shape.fun1(1.1);
        shape.fun1(1, 2);
    }
}
