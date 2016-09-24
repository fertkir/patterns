package com.fertikov.patterns.structural.composite;

public class Programmer implements WorkingUnit {
    @Override
    public void work() {
        System.out.println("I'm writing code");
    }
}
