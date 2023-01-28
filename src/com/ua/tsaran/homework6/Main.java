package com.ua.tsaran.homework6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1;i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1;i <= 100; i++) {
            if (i % 2 == 0) {
            System.out.print(i + " ");
            }
        }
        System.out.println();


        int f = 1;
        for (int i = 1;i <= 7; i++) {
            f = f * i;
        }
            System.out.println("!7 = " + f);


        int x = 1;
        int y = 1;
        int d = x + y;
        System.out.print("Числа Фібоначчі: " + x + " " + y + " ");
        while (d < 100) {
            System.out.print(d+ " ");
            x = y;
            y = d;
            d = x + y;
        }
    }
}
