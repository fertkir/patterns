package com.fertikov.patterns.abstractfactory;

public class RealComponentsFactory implements AbstractFactory {
    @Override
    public Component1 createComponent1() {
        return new RealComponent1();
    }

    @Override
    public Component2 createComponent2() {
        return new RealComponent2();
    }
}
