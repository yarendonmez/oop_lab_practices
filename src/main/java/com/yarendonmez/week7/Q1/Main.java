package com.yarendonmez.week7.Q1;

// Base class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ".");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Subclass of Person
class Student extends Person {
    protected String schoolName;

    public Student(String name, String schoolName) {
        super(name); // Call the constructor of Person
        this.schoolName = schoolName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Optionally display Person info
        System.out.println("School: " + schoolName);
    }
}

// Subclass of Student
class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, String schoolName, String thesisTopic) {
        super(name, schoolName); // Call the constructor of Student
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Optionally display Student info
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Zeynep");
        Student s = new Student("Murat", "Gazi University");
        GraduateStudent gs = new GraduateStudent("Yaren", "Gazi University", "AI in Cybersecurity");

        p.introduce();
        p.displayInfo();
        System.out.println();

        s.introduce();
        s.displayInfo();
        System.out.println();

        gs.introduce();
        gs.displayInfo();
    }
}
