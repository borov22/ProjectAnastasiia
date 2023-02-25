package com.ua.tsaran.homework12;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Степанюк Іван Валентинович";
        teacher.getName();
        teacher.activity = "Виставляє оцінки за семестр.";
        teacher.getActivity();
        Student student = new Student();
        student.name = "Горішня Вікторія Орестівна";
        student.getName();
        student.activity = "Готується до заліку.";
        student.getActivity();
    }
}
