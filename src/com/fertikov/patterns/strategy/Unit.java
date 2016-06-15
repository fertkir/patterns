package com.fertikov.patterns.strategy;

public class Unit {
    public void act(Strategy action) {
        System.out.print("I do the following action: ");
        action.action();
    }
}
