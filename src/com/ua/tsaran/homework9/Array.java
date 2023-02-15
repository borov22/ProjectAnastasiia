package com.ua.tsaran.homework9;

import java.util.Random;

public class Array {

    static void sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    static void sortArrayBack(int[] array) {
        int numb = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < (array.length); j++) {
                if (array[i] < array[j]) {
                    numb = array[i];
                    array[i] = array[j];
                    array[j] = numb;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[8];
        int maxVal = 10;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxVal);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        sortArray(array);

        System.out.println("Масив після сортування за зростанням: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        sortArrayBack(array);

        System.out.println("Масив після сортування за зменшенням: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}


