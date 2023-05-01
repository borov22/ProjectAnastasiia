package com.ua.tsaran.homework32;

public class Main {
    public static void main(String[] args) {
        Threads t1 = new Threads();
        Thread FirstThread = new Thread(t1);

        Threads t2 = new Threads();
        Thread SecondThread = new Thread(t2);

        FirstThread.start();
        SecondThread.start();
    }
}
