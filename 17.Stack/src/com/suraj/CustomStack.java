package com.suraj;

public class CustomStack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1; // pointer to indicate current index

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE); // using above constructor
    }

    public boolean isEmpty(){
        return (ptr == -1);
    }

    public boolean isFull(){
        return (ptr == data.length-1);
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full.");
            return false;
        }

        ptr++;
        data[ptr] = value;
//        data[++ptr] = value;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }

    public int peek() throws Exception  {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }

        return data[ptr];
    }
}
