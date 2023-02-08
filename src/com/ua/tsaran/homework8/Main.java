package com.ua.tsaran.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxValue = 25;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Найменше число масиву: " + minNumber(array));

        System.out.println("Найбільше число масиву: " + maxNumber(array));

        System.out.println("Середнє арифметичне з чисел масиву: " + averageNumber(array));

        System.out.println("Сума всіх чисел масиву: " + sumNumber(array));
    }

    static int minNumber(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }

    static int maxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    static double averageNumber(int[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum/array.length;
        return average;
    }

    static int sumNumber(int[] array) {
        int summ = 0;
        for(int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        return summ;
    }
}
