package com.yarendonmez.week5.Abstract_Animal;

// Abstract base class representing any animal
abstract class Animal {
    private String name;

    // Constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Concrete method for eating behavior
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
