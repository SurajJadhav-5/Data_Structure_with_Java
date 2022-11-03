package com.suraj.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.start();

        /*
        Engine engine = new Engine() {   // if you want to create object of Interface the override all methods
            @Override
            public void start() { }

            @Override
            public void acc() { }

            @Override
            public void brake() { }

            @Override
            public void stop() { }
        };
         */


        NewCar newCar = new NewCar();
        newCar.start();
        newCar.acc();
        newCar.startMusic();
        newCar.stopMusic();
        newCar.brake();
        newCar.upgradeEngine();
        newCar.start();
        newCar.stop();
    }


}
