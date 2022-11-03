package com.suraj.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human suraj = new Human(22, "Suraj");
        // old method to copy object
        Human other = new Human(suraj);
        System.out.println(other.name);

        // clone method
        Human twin = (Human)suraj.clone();
        System.out.println(twin.name);
    }
}
