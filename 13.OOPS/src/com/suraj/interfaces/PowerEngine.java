package com.suraj.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate Power Engine");

    }

    @Override
    public void brake() {
        System.out.println("Break Power Engine");

    }

    @Override
    public void stop() {
        System.out.println("Stop Power Engine");

    }
}
