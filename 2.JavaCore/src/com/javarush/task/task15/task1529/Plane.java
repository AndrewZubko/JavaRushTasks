package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int passenger;
    @Override
    public void fly() {

    }

    public Plane(int passenger) {
        this.passenger = passenger;
    }
}
