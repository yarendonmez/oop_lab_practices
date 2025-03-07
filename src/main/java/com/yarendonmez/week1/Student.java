package com.yarendonmez.week1;

public class Student {
    String name;
    int midterm1;
    int midterm2;
    int finalExam;

    // Constructor
    Student(String name, int midterm1, int midterm2, int finalExam) {
        this.midterm1 = midterm1;
        this.midterm2 = midterm2;
        this.finalExam = finalExam;
    }

    double calculateAverage() {
        return (midterm1 * 0.30) + (midterm2 * 0.30) + (finalExam * 0.40);
    }


    String isPassed() {
        return calculateAverage() >= 60 ? "Geçti" : "Kaldı";
    }

    void showInfo() {
        System.out.println("Vize 1: " + midterm1);
        System.out.println("Vize 2: " + midterm2);
        System.out.println("Final: " + finalExam);
        System.out.println("Ortalama: " + calculateAverage());
        System.out.println("Durum: " + isPassed());
    }
    public static void main(String[] args) {
        // Öğrenci nesnesi oluşturma
        Student student1 = new Student("Yaren", 100, 80, 90);
        student1.showInfo();
    }
}
