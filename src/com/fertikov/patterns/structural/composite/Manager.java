package com.fertikov.patterns.structural.composite;

public class Manager implements WorkingUnit {
    @Override
    public void work() {
        System.out.println("I'm managing the project");
    }
}
