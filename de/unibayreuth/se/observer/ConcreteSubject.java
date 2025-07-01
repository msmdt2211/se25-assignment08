package de.unibayreuth.se.observer;

public class ConcreteSubject extends Subject {
    private int value;

    public void setValue(int value) {
        this.value = value;
        System.out.println("Sende Update an Beobachter ...");
        fireUpdate();
    }
    public int getValue() {
        return value;
    }
}
