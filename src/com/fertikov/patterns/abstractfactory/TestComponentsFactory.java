package com.fertikov.patterns.abstractfactory;

public class TestComponentsFactory implements AbstractFactory {
    @Override
    public Component1 createComponent1() {
        return new TestComponent1();
    }

    @Override
    public Component2 createComponent2() {
        return new TestComponent2();
    }
}
