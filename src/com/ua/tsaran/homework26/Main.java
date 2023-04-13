package com.ua.tsaran.homework26;

import java.util.Scanner;

public class Main {
    public static int calculateSquare(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Будь ласка, введіть число: ");
        int number = scanner.nextInt();

        try {
            int result = calculateSquare(number);
            System.out.println("Квадрат числа " + number + " = " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
