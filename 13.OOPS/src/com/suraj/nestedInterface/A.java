package com.suraj.nestedInterface;

public interface A {
    // nested interface
    public interface NestedInterface{
        boolean  isOdd(int n);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));

    }
}
