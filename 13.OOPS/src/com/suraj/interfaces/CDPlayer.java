package com.suraj.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start Media");

    }

    @Override
    public void stop() {
        System.out.println("Stop Media");

    }
}
