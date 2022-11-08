package com.suraj;

public class Main {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);

//        stack.push(2);
//        stack.push(12);
//        stack.push(19);
//        stack.push(20);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        DynamicStack dstack = new DynamicStack(5);
        dstack.push(2);
        dstack.push(12);
        dstack.push(19);
        dstack.push(20);
        dstack.push(56);
        dstack.push(89);
        dstack.push(78);
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
    }
}
