package com.fertikov.patterns.creational.factorymethod;

public class Pigeon extends Bird {
    @Override
    protected Egg makeEgg() {
        return new PigeonEgg();
    }
}
