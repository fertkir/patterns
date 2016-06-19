package com.fertikov.patterns.structural.bridge;

public class MockImplementor implements Implementor {
    @Override
    public void doOneThing() {
        System.out.println("Mocking one thing");
    }

    @Override
    public void doAnotherThing() {
        System.out.println("Mocking another thing");
    }
}
