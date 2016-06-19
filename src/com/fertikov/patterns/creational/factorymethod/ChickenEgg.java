package com.fertikov.patterns.creational.factorymethod;

public class ChickenEgg implements Egg {
    @Override
    public void whoseAmI() {
        System.out.println("I'm chicken's!");
    }
}
