package com.fertikov.patterns.factorymethod;

public class PigeonEgg implements Egg {
    @Override
    public void whoseAmI() {
        System.out.println("I'm pigeon's");
    }
}
