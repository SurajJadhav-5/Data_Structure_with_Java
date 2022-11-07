package com.suraj;

public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    public CircularLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        else {

            tail.next = node;
            node.next = head;
            tail = node;
            size++;
        }

    }

    public void display(){
        if(head == null){
            System.out.println(" No items in list");
        }
        else{
            Node temp = head;
            do{
                System.out.print(temp.value +  " <C> ");
                temp = temp.next;
            }while (temp!= head);
            System.out.println("Circular to head");

        }

    }

    public void delete(int value ){
        Node temp = head;
        if(temp == null)
            return;

        if(temp.value == value){
            head = head.next;
            temp.next = head;
            return;
        }

        do{
            Node n = temp.next;
            if(n.value == value){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);
    }

    private class Node{
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }
    }


}
