package com.ua.tsaran.homework12;

public class Student extends Human {
    private int course;
    private int major;
    String activity;
    String name;


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    @Override
    public void getActivity() {
        System.out.println("Що робить студент: " + activity);
    }

    @Override
    public void getName() {
        System.out.println("Ім'я студента: " + name);
    }
}
