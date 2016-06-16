package com.fertikov.patterns.decorator;

public abstract class AbstractDecorator implements Component {

    private Component component;

    public AbstractDecorator(Component someClass) {
        this.component = someClass;
    }

    @Override
    public void action1() {
        component.action1();
    }

    @Override
    public void action2() {
        component.action2();
    }
}
