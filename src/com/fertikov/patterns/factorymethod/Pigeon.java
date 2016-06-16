package com.fertikov.patterns.factorymethod;

public class Pigeon extends Bird {
    @Override
    protected Egg makeEgg() {
        return new PigeonEgg();
    }
}
