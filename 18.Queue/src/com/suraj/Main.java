package com.suraj;

public class Main {
    public static void main(String[] args) throws Exception{

//        CustomQueue queue = new CustomQueue(5);
//
//        queue.insert(12);
//        queue.insert(16);
//        queue.insert(45);
//        queue.insert(56);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.display();

        CircularQueue cq = new CircularQueue(5);
        cq.insert(12);
        cq.insert(19);
        cq.insert(25);
        cq.insert(23);
        cq.insert(33);

        cq.display();

        System.out.println(cq.remove());
        cq.insert(100);
        cq.display();
    }
}
