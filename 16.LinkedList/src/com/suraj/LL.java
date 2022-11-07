package com.suraj;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        // create new node
        Node node = new Node(value);
        // as it is first element make it as head
        node.next = head;
        head = node;

        // only one element then tail = head
            if(tail == null){
                tail = head;
            }
        size++;
    }

    public void insertLast(int value){

        // if list is empty then last element will be first
        if(tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
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
        // one way
//        Node node = new Node(value);
//        Node nextTemp = temp.next;
//        temp.next = node;
//        node.next = nextTemp;

        // 2nd way
        Node node = new Node(value, temp.next);
        temp.next = node;


        size++;

    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null)
            tail = null;

        size--;
        return val;
    }

    // it will return referance to last node
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index-2; i++) {
            node = node.next;
        }

        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        size--;
        return val;
    }

    public boolean search(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }



}
