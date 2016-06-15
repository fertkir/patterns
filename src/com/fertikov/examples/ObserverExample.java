package com.fertikov.examples;

import com.fertikov.patterns.observer.Observable;

public class ObserverExample {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(observable -> {
            Subject subj = (Subject) observable;
            System.out.println("Observer 1 sees coordinates: " + subj.x + ":" + subj.y);
        });
        subject.attach(observable -> {
            Subject subj = (Subject) observable;
            System.out.println("Observer 2 sees coordinates: " + subj.x + ":" + subj.y);
        });

        subject.moveX();
        subject.moveY();
        subject.moveY();
        subject.moveX();
    }

    private static class Subject extends Observable {
        private int x;
        private int y;

        void moveX() {
            x += 1;
            notifyObservers();
        }

        void moveY() {
            y += 1;
            notifyObservers();
        }
    }
}
