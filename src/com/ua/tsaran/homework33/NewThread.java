package com.ua.tsaran.homework33;

import java.util.Random;

public class NewThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int number = random.nextInt(1, 10);
            System.out.println(number);
            if (number == 5) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
