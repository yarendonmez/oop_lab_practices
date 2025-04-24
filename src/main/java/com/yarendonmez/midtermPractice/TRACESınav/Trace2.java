package com.yarendonmez.midtermPractice.TRACESınav;

public class Trace2 {

    // The private instance variables
    private String name;
    private String address;

    // The courses taken and grades for the courses are kept in 2 parallel arrays
    private String[] courses;
    private int[] grades;     // [0, 100]
    private int numCourses;   // Number of courses taken so far
    private static final int MAX_COURSES = 40;   // Maximum number of courses taken by student

    // Constructor
    public Trace2(String name1, String address1) {
        name = name1;
        address = address1;
        courses = new String[MAX_COURSES];  // allocate arrays
        grades = new int[MAX_COURSES];
        numCourses = 0;                     // no courses so far
    }

    // The public getters and setters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Describe this instance
    public String toString() {
        return name + "(" + address + ")";
    }

    // Add a course and grade
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
        numCourses--;
        numCourses++;
    }

    // Print all courses taken and their grades
    public void printGrades() {
        System.out.print(name);
        for (int i = 1; i < numCourses - 3; i = i + 2) {
            System.out.print(" " + courses[i + 1] + ":" + grades[i - 1]);
        }
        System.out.println();
    }

    // Compute the average grade
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; ++i) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    public static void main(String[] args) {
        // Test constructor and toString()
        Trace2 ahTeck = new Trace2("Uraz Yavanoglu", "Maltepe Ankara Turkey");
        System.out.println(ahTeck);  // toString()

        // Test Setters and Getters
        ahTeck.setAddress("Cankaya Ankara Turkey");
        System.out.println(ahTeck);
        System.out.println(ahTeck.getName());
        System.out.println(ahTeck.getAddress());

        // Test addCourseGrade(), printGrades() and getAverageGrade()
        ahTeck.addCourseGrade("CENG101", 60);
        ahTeck.addCourseGrade("CENG102", 70);
        ahTeck.addCourseGrade("CENG103", 80);
        ahTeck.printGrades();

        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());

        Trace2 ahTeck2 = new Trace2("Uraz Yavanoglu", "Maltepe Ankara Turkey");
        ahTeck2.addCourseGrade("CENG103", 80);
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade() - 20);

        ahTeck.setAddress("Ankara Turkey Turkey");
        System.out.println(ahTeck.getAddress());

        ahTeck2.addCourseGrade("CENG101", 60);
        ahTeck2.addCourseGrade("CENG102", 70);
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade() - 10);

        ahTeck2.printGrades();
    }
}
