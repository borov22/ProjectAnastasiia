package com.ua.tsaran.homework13;

public class Driver extends Human implements Drive {
    @Override
    public void drive() {
        System.out.println("Я можу водити різний транспорт");
    }
}
