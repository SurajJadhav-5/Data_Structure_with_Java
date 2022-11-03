package com.suraj.interfaces;

public interface Engine {
    static final int PRICE = 100;  // by default variables are static final

    public abstract void start();  // by default functions are public abstract
    void acc();
    void brake();
    void stop();

}
