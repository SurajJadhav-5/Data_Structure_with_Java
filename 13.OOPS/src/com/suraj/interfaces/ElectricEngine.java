package com.suraj.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate Electric Engine");
    }

    @Override
    public void brake() {
        System.out.println("Break Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Electric Engine");
    }
}
