package com.fertikov.examples;

import com.fertikov.patterns.observer.Subject;

public class ObserverExample {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(observable -> {
            Subject subj = (Subject) observable;
            System.out.println("Observer 1 sees coordinates: " + subj.getX() + ":" + subj.getY());
        });
        subject.attach(observable -> {
            Subject subj = (Subject) observable;
            System.out.println("Observer 2 sees coordinates: " + subj.getY() + ":" + subj.getX());
        });

        subject.moveX();
        subject.moveY();
        subject.moveY();
        subject.moveX();
    }

}
