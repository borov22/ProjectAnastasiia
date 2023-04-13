package com.ua.tsaran.homework26;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
        super("Ви ввели число менше нуля!");
    }
}
