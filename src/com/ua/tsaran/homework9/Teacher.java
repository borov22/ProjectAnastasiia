package com.ua.tsaran.homework9;

public class Teacher {
    private String fullName;
    private String subject;
    private int yearsExperience;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public void prepareToTheLesson() {
        System.out.println("Пише план заняття.");
    }

    public void holdLessons() {
        System.out.println("Проводить лекції для студентів.");
    }

    public void goToTheBar() {
        System.out.println("Йде з друзями у бар попліткувати за келихом вина.");
    }
}
