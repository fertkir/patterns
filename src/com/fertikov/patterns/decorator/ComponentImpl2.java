package com.fertikov.patterns.decorator;

public class ComponentImpl2 implements Component {
    @Override
    public void action1() {
        System.out.println("ComponentImpl2: performing action 1");
    }

    @Override
    public void action2() {
        System.out.println("ComponentImpl2: performing action 2");
    }
}
