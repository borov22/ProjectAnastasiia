package com.ua.tsaran.homework22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sokyra", 4.4));
        students.add(new Student("Chubenko", 3.5));
        students.add(new Student("Salo", 4.0));
        students.add(new Student("Volny", 3.8));
        students.add(new Student("Bulochka", 4.6));

        System.out.println("Не сортований список:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " - " + student.getAvgScore());
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println();

        System.out.println("Сортування за прізвищем:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " - " + student.getAvgScore());
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAvgScore(), o2.getAvgScore());
            }
        });
        System.out.println();

        System.out.println("Сортування за середнім балом:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " - " + student.getAvgScore());
        }
    }
}
