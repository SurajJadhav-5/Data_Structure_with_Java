package com.suraj.Static;

public class InnerClasses {
    static class A{ //inner class must be static
        String name;
        A(String name){
            this.name = name;
        }

        public static void main(String[] args) {
            A a1 = new A("Suraj");
            A a2 = new A("Ram");
            System.out.println(a1.name);
            System.out.println(a2.name);

            // if name variable is static then it will print same name as it is independent of objec
            // if not it will print as object name

        }

    }
}
