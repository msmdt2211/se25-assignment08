package de.unibayreuth.se.observer;

public class ConcreteSubject {
    private int value;

    public void setValue(int value) {
        this.value = value;
        fireUpdate();
    }
    public int getValue() {
        return value;
    }
}
