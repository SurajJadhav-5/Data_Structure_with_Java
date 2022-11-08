package com.suraj;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {

    public static void main(String[] args) {

        // Queue is not a class it is a interface. So we are using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(19);
        queue.add(34);
        queue.add(56);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        // you can add or remove from both end
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.addFirst(23);
        deque.remove();
    }
}
