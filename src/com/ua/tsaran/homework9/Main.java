package com.ua.tsaran.homework9;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFullName("Грозний Микита Валентинович");
        student.setMajor("Англійська філологія");
        student.setCourse(2);

        student.study();
        student.missLesson();
        student.doHomework();

        Teacher teacher = new Teacher();

        teacher.setFullName("Квітка Аліна Дмитрівна");
        teacher.setSubject("Лінгвокраїнознавство");
        teacher.setYearsExperience(15);

        teacher.prepareToTheLesson();
        teacher.holdLessons();
        teacher.goToTheBar();
    }
}
