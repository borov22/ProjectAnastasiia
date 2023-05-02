package com.ua.tsaran.homework34;

import java.util.Random;
import java.util.concurrent.Callable;
public class Call implements Callable {
    @Override
    public Integer call() throws Exception {
        int randomNumber = new Random().nextInt(1, 50);
        return randomNumber;
    }
}
