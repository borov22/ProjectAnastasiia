package com.ua.tsaran.homework5;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 53;
        if (x > y) {
            System.out.println(x);
        }
        else if (y > x) {
            System.out.println(y);
        }
        else {
            System.out.println("Числа рівні");
        }


        if (x < y) {
            System.out.println(x);
        }
        else if (y < x) {
            System.out.println(y);
        }
        else {
            System.out.println("Числа рівні");
        }


        if (x % 2 == 0) {
            System.out.println(x + " -" + " " + "парне число");
        }
        else if (y % 2 == 0) {
            System.out.println(y + " -" + " " + "парне число");
        }
    }
}
