package com.ua.tsaran.homework10;

public class SimpleCar extends Car {

    private int carLength;

    public int getCarLength() {
        return carLength;
    }

    public void setCarLength(int carLength) {
        this.carLength = carLength;
    }

    public SimpleCar() {
        this.model = "Nissan";
    }

    @Override
    public String returnModel() {
        return this.model;
    }
}
