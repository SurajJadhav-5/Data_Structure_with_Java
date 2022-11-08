package com.suraj;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE); // using above constructor
    }


    public boolean isEmpty(){
        return   size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[end] = value;
        end++;
//        data[end++] = value;
        end = end %data.length;  // to get the correct index in array(queue)
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front++;
        front = front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("End");

    }
}
