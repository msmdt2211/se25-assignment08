package de.unibayreuth.se.observer;

import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void fireUpdate() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
