package com.ua.tsaran.homework13;

public class Pilot extends Human implements Fly {

    @Override
    public void fly() {
        System.out.println("Я можу літати на чому завгодно");
    }
}
