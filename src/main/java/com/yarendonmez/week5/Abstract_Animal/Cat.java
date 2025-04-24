package com.yarendonmez.week5.Abstract_Animal;

// Subclass representing a specific type of Animal: Cat
class Cat extends Animal {

    // Constructor that calls the superclass constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of the abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

