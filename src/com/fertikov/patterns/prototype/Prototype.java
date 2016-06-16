package com.fertikov.patterns.prototype;

public class Prototype implements Copyable {

    private double state;

    public Prototype() {
        state = Math.random();
    }

    public double getState() {
        return state;
    }

    @Override
    public Prototype copy() {
        Prototype prototype = new Prototype();
        prototype.state = this.state;
        return prototype;
    }
}
