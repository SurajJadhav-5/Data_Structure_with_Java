package com.suraj.Static;

public class Main {
    public static void main(String[] args) {
        Human suraj = new Human(22, "Suraj", 66);
        Human ram = new Human(32, "Ram", 88);

        System.out.println(suraj.name);
//        System.out.println(suraj.population); //dont use object name
        System.out.println(Human.population); // use class name for static variable
        greeting();
//        fun(); // we cant use it here because it is non static


    }

    static void greeting(){
        System.out.println("Hello World");
//        fun();  // non static in static is not allowed

        Main A = new Main();
        A.fun();  // functioo is used by referancing to object hence we can use non ststic in static
                    // as non static are dependent on object and ststic are independent of object
    }

    void fun(){
        System.out.println("Function");
        greeting();  // static is allowed in non static
    }
}
