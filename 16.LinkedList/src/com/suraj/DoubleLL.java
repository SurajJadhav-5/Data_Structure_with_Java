package com.suraj;

public class DoubleLL {

    private Node head;
    private Node tail;
    int size;

    public DoubleLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        //forward connection
        node.next = head;

        // prev off head will always be null;
        node.prev = null;

        //backward connection
        if(head != null){
            head.prev = node;
        }
        // changing head position
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;

    }

    public void insertLast(int value){
        Node last = new Node(value);

        if(size == 0){
            insertFirst(value);
            return;
        }
        tail.next = last; //forward connection
        last.prev = tail; // backward connection
        last.next = null;
        tail = last; // tail must be last element
        size++;

    }

    public void insertIndex(int value, int index){

        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        if(index > size){
            System.out.println("Index out of bound  " + index);
            return;
        }


        Node temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null) {
            node.next.prev = node;
        }
        size++;

    }

    // gives the node pointer
    public Node search(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public void insertAfterNode(int after, int value){

        Node prev = search(after);

        if(prev == null){
            System.out.println("does not exist");
            return;
        }

        Node temp = new Node(value);
        temp.next = prev.next;
        prev.next = temp;
        temp.prev = prev;
        if(temp.next != null) {
            temp.next.prev = temp;
        }
        else{
            tail = temp;
        }

        size++;
    }



    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + " <-> ");
            node = node.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node node = tail;
        while (node != null){
            System.out.print(node.value + " <-> ");
            node = node.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
        Node prev;
        Node next;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        private Node(int value, Node prev, Node next)
        {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }


}
