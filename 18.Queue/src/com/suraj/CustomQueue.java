package com.suraj;

public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = -1;

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE); // using above constructor
    }


    public boolean isEmpty(){
        return end == -1;
    }

    public boolean isFull(){
        return end == data.length-1;
    }

    // O(1) - complexity
    public boolean insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        end++;
        data[end] = value;
//        data[++end] = value;
        return true;
    }

    // O(n) - complexity
    public int remove() throws  Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for(int i= 1; i< end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int face() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() throws  Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " <-");
        }
        System.out.println("End");
    }
}
