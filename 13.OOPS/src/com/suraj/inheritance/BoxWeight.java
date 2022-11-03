package com.suraj.inheritance;

public class BoxWeight extends Box{
    double  weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h,double weight){
        super(l, w, h); // calling  constructor of the base class
        this.weight = weight;

//        System.out.println(super.w); // super class use
    }

    BoxWeight(BoxWeight other){
        super(other);  // it still invokes the base class constructor
        this.weight = other.weight;
    }
}
