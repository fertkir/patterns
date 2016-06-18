package com.fertikov.patterns.abstractfactory;

public class RealComponent2 implements Component2 {
    @Override
    public void action1() {
        System.out.println("Real component 2 makes action 1");
    }

    @Override
    public void action2() {
        System.out.println("Real component 2 makes action 2");
    }
}
