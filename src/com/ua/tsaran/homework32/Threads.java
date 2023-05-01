package com.ua.tsaran.homework32;

public class Threads implements Runnable {
    @Override
    public void run () {
        for (int i = 1; i <= 10; i++ ){
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
        }
        catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
