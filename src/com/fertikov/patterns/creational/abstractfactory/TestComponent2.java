package com.fertikov.patterns.creational.abstractfactory;

public class TestComponent2 implements Component2 {
    @Override
    public void action1() {
        System.out.println("Test component 2 makes action 1");
    }

    @Override
    public void action2() {
        System.out.println("Test component 2 makes action 2");
    }
}
