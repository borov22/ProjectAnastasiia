package com.ua.tsaran.homework22;

public class Student {
    private String lastName;
    private double avgScore;

    public Student(String lastName, double avgScore) {
        this.lastName = lastName;
        this.avgScore = avgScore;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
}
