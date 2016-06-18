package com.fertikov.patterns.proxy;

public class ComponentLoggingProxy implements Component {

    private Component component = new ComponentImpl();

    @Override
    public void doSmth() {
        System.out.println("Logging doing something of a component");
        component.doSmth();
    }
}
