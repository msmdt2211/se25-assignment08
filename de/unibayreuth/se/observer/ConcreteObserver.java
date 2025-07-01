package de.unibayreuth.se.observer;

public class ConcreteObserver implements Observer {

    private Subject subject;
    private String name;
    private static int counter = 1;
    private int id;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.name = name;
        this.id = counter++;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        int value = ((ConcreteSubject) subject).getValue();
        System.out.println("Beobachter " + id + " erhielt Update vom subject ConcreteSubject : " + value);
    }

    public void detach() {
        subject.detach(this);
    }
}
