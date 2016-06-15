package com.fertikov.patterns.observer;

public class Subject extends Observable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveX() {
        x += 1;
        notifyObservers();
    }

    public void moveY() {
        y += 1;
        notifyObservers();
    }
}
