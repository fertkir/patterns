package com.fertikov.examples;

import com.fertikov.patterns.abstractfactory.*;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        execute(new RealComponentsFactory());
        System.out.println();
        execute(new TestComponentsFactory());
    }

    private static void execute(AbstractFactory factory) {
        Component1 component1 = factory.createComponent1();
        Component2 component2 = factory.createComponent2();
        component1.action1();
        component1.action2();
        component2.action1();
        component2.action2();
    }
}
