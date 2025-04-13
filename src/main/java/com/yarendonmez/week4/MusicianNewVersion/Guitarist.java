package com.yarendonmez.week4.MusicianNewVersion;


//Create a subclass called Guitarist that inherits from Musician.
public class Guitarist extends Musician {
    //An additional field: genre (e.g., Rock, Jazz)
    String genre;

    //In the constructor, use super() to pass name and instrument to the superclass
    public Guitarist(String name, String genre) {
        super(name, "guitar");
        this.genre = genre;
    }

    //Override the playMusic() method:

    @Override
    public void playMusic() {
        //First call super.playMusic()
        super.playMusic();
        //Then, print: "[name] is a [genre] guitarist."
        System.out.printf("%s is a %s guitarist.%n", name, genre);
    }

    //NOT: Eğer ödevde istenen gereksinim yukarıdaki gibi olmasa aşağıdaki gibi kodlardım:

    //    public Guitarist(String name, String genre) {
    //        super(name, "guitar");
    //        this.genre = genre;
    //    }

    // Bu sayede Guitarist sınıfına ait bir objectin instrument fieldı otomatik olarak "guitarist" olurdu.

    //Main Kullanımı:

    //public class Main {
    //    public static void main(String[] args) {
    //
    //        //Create a Guitarist object
    //        Guitarist guitarist = new Guitarist("Yaren", "rock");
    //
    //        //Call its playMusic() method
    //        guitarist.playMusician();
    //    }
    //
    //}
}

