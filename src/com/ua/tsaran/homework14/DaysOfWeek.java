package com.ua.tsaran.homework14;

public enum DaysOfWeek {
    MONDAY(1,"Monday"),
    TUESDAY(2,"Tuesday"),
    WEDNESDAY(3,"Wednesday"),
    THURSDAY(4,"Thursday"),
    FRIDAY(5,"Friday"),
    SATURDAY(6,"Saturday"),
    SUNDAY(7,"Sunday");

    int number;
    String name;

    DaysOfWeek(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
