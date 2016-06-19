package com.fertikov.patterns.creational.abstractfactory;

public class TestComponent1 implements Component1 {
    @Override
    public void action1() {
        System.out.println("Test component 1 makes action 1");
    }

    @Override
    public void action2() {
        System.out.println("Test component 1 makes action 2");
    }
}
