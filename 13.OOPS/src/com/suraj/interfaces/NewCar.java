package com.suraj.interfaces;

import java.security.PublicKey;

public class NewCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NewCar(){
        this.engine = new PowerEngine();
    }
    public void start(){
        engine.start();
    }
    public void acc(){
        engine.acc();
    }
    public void brake(){
        engine.brake();
    }
    public void stop(){
        engine.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }





}
