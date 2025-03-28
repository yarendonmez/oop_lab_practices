package com.yarendonmez.week4.MusicianSystem;


public class Musician {
    // Fields: name and instrument
    String name;
    String instrument;

    //A constructor to initialize them
    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    //A method playMusic() that prints: "Musician [name] is playing [instrument]."
    public void playMusic() {
        System.out.printf("Musician %s is playing %s.%n", name, instrument);
    }

}
