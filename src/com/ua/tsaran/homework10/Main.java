package com.ua.tsaran.homework10;

public class Main {
    public static void main(String[] args) {

        SimpleCar simpleCar = new SimpleCar();
        simpleCar.setCarLength(4);
        System.out.println(simpleCar.returnModel());

        Truck truck = new Truck();
        truck.setWeight(6000);
        System.out.println(truck.returnModel());
    }
}
