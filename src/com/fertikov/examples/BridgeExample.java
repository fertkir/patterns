package com.fertikov.examples;

import com.fertikov.patterns.structural.bridge.Abstraction;
import com.fertikov.patterns.structural.bridge.MockImplementor;
import com.fertikov.patterns.structural.bridge.RealImplementor;

public class BridgeExample {
    public static void main(String[] args) {
        Abstraction realAbstraction = new Abstraction(new RealImplementor());
        Abstraction mockAbstraction = new Abstraction(new MockImplementor());
        realAbstraction.action1();
        realAbstraction.action2();
        mockAbstraction.action1();
        mockAbstraction.action2();
    }
}
