package com.fertikov.patterns.structural.bridge;

public class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void action1() {
        implementor.doOneThing();
    }

    public void action2() {
        implementor.doAnotherThing();
    }
}
