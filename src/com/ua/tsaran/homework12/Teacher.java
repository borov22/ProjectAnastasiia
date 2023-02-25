package com.ua.tsaran.homework12;

public class Teacher extends Human {
    private int yearsExperience;
    private String subject;
    String activity;
    String name;

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void getActivity() {
        System.out.println("Що робить викладач: " + activity);
    }

    @Override
    public void getName() {
        System.out.println("Ім'я викладача: " + name);
    }
}
