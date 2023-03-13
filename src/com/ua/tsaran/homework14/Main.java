package com.ua.tsaran.homework14;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(3));
    }

    private static String getDayOfWeek(int number) {
        for (DaysOfWeek day: DaysOfWeek.values()) {
            if(day.number == number) {
                return day.name;
            }
        }
        return null;
    }
}

