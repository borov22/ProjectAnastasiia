package com.ua.tsaran.homework9;

public class Student {
    private String fullName;
    private String major;
    private int course;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void study() {
        System.out.println("Йде на пару.");
    }

    public void missLesson() {
        System.out.println("Прогулює заняття у кіношці.");
    }

    public void doHomework() {
        System.out.println("Пише свій перший курсач.");
    }
}
