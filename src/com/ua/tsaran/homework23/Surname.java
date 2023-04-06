package com.ua.tsaran.homework23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Surname {
    public static void main(String[] args) {
        ArrayList<String> surnamesList = new ArrayList<>();
        surnamesList.add("Хрюкін");
        surnamesList.add("Джонсонюк");
        surnamesList.add("Царан");
        surnamesList.add("Пена");
        surnamesList.add("Зеленський");
        surnamesList.add("Гнечка");
        surnamesList.add("Тополя");
        surnamesList.add("Кабанист");
        surnamesList.add("Пена");
        surnamesList.add("Кабанист");
        surnamesList.add("Гнечка");
        surnamesList.add("Джонсонюк");
        surnamesList.add("Пена");
        surnamesList.add("Хрюкін");
        surnamesList.add("Джонсонюк");
        surnamesList.add("Гнечка");
        surnamesList.add("Хрюкін");
        surnamesList.add("Кабанист");
        surnamesList.add("Пена");
        surnamesList.add("Гнечка");

        Map<String, Long> surnameMap = surnamesList.stream()
                .collect(Collectors.groupingBy(surname -> surname, Collectors.counting()));

        System.out.println(surnameMap);
    }
}