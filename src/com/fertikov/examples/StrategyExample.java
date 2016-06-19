package com.fertikov.examples;

import com.fertikov.patterns.behavioral.strategy.Unit;

public class StrategyExample {
    public static void main(String[] args) {
        Unit unit = new Unit();
        unit.act(() -> System.out.println("move forward"));
        unit.act(() -> System.out.println("turn right"));
    }
}
