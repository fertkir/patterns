package com.fertikov.patterns.decorator;

public class DecoratorImpl1 extends AbstractDecorator {
    public DecoratorImpl1(Component someClass) {
        super(someClass);
    }

    @Override
    public void action1() {
        System.out.println("DecoratorImpl1: decorating action 1");
        super.action1();
    }

    @Override
    public void action2() {
        System.out.println("DecoratorImpl1: decorating action 2");
        super.action2();
    }
}
