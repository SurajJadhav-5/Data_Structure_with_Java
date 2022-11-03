package com.suraj.Static;

public class StaticBlock {
    static int a = 1;
    static int b;

    static { // this will be called only once when the class is loaded or when the first object is created.
        System.out.println("Static Block");
        b = a * 10;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

        b += 12;
        System.out.println(b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 2;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
