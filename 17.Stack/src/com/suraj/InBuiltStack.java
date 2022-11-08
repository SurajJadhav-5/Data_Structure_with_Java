package com.suraj;

import java.util.Stack;

public class InBuiltStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(19);
        stack.push(25);

        System.out.println(stack.search(19));

        System.out.println(stack.pop());
        System.out.println(stack.search(25));
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
