package com.suraj.access;

public class A {
    private int num;
    String name;
    int[] arr;

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    // getter
    public int getNum(){
        return num;
    }

    //setter
    public void setNum(int num){
        this.num = num;
    }


}
