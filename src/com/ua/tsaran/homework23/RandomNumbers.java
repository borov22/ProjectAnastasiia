package com.ua.tsaran.homework23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(22));
        }

        System.out.println("Випадкові числа: " + randomNumbers);

        int sum = randomNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Їх сума: " + sum);
    }
}
