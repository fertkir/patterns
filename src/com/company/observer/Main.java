package com.company.observer;

/**
 * Created by fertkir on 15.06.16.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject(2, 2);
        subject.attach(subj -> {
            Subject s = (Subject) subj;
            System.out.println("Subject coordinates: " + s.getX() + ":" + s.getY());
        });
        subject.moveX();
        subject.moveY();
    }
}
