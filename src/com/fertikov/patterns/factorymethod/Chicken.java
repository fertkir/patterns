package com.fertikov.patterns.factorymethod;

public class Chicken extends Bird {
    @Override
    protected Egg makeEgg() {
        return new ChickenEgg();
    }
}
