package com.fertikov.patterns.creational.factorymethod;

public class Chicken extends Bird {
    @Override
    protected Egg makeEgg() {
        return new ChickenEgg();
    }
}
