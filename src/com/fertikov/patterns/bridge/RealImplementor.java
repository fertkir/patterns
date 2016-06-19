package com.fertikov.patterns.bridge;

public class RealImplementor implements Implementor {
    @Override
    public void doOneThing() {
        System.out.println("Doing one thing");
    }

    @Override
    public void doAnotherThing() {
        System.out.println("Doing another thing");
    }
}
