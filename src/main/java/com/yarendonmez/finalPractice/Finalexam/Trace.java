package com.yarendonmez.finalPractice.Finalexam;


interface Uraz {
    public void animalSound();
    public void sleep();
}

class Cup {
    protected int k;
    static int m = 0;
    private int array[];

    public Cup() {
        array = new int[10];
    }

    public void wash() {
        System.out.println("Washing a Cup.");
    }

    public void printK() {
        System.out.println(this.k + "\n" + array[m] + 0 / 2);
    }

    public void sumAll() {
        m--;

        int a = 0;
        int n = 1;

        try {
            n = 5 / a;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
            n++;
        } finally {
            n--;
            System.out.println(n);
        }

        System.out.println(n);
    }
}

class CoffeeCup extends Cup {
    public void wash() {
        System.out.println("Washing a CoffeeCup.");
        for (int i = 0; i < 9; i++) {
            k++;
        }
        printK();
        super.sumAll();
    }
}

class CoffeeMug extends CoffeeCup {
    public void wash() {
        System.out.println("Washing a CoffeeMug.");
        System.out.println(k);
        printK();
    }
}

class EspressoCup extends CoffeeCup {
    public void wash() {
        System.out.println("Washing an EspressoCup.");
        printK();
    }
}

class VirtualCafe {
    public static void prepareACup(Cup cup) {
        cup.wash();
    }
}

public class Trace {
    public static void main(String[] args) {
        Cup c = new Cup();
        CoffeeCup cc = new CoffeeCup();
        CoffeeMug cm = new CoffeeMug();
        EspressoCup ec = new EspressoCup();

        try {
            VirtualCafe.prepareACup(c);
            c.printK();
            VirtualCafe.prepareACup(cc);
            VirtualCafe.prepareACup(cm);
        } catch (Exception ex) {
            System.out.println("k");
            System.out.println("k,m");
        } finally {
            VirtualCafe.prepareACup(ec);
            c.printK();
        }
    }
}
