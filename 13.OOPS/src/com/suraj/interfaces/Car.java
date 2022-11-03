package com.suraj.interfaces;

public class Car implements Engine, Media{

    @Override
    public void start(){
        System.out.println("Start the Engine");
    }


    @Override
    public void acc() {
        System.out.println("Accelerate the car");
    }

    @Override
    public void brake() {
        System.out.println("Break the car");
    }

    @Override
    public void stop() {

    }
}
