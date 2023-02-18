package com.ua.tsaran.homework10;

public class Truck extends Car {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck() {
        this.model = "Scania";
    }

    @Override
    public String returnModel() {
        return this.model;
    }
}
