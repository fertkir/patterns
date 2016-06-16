package com.fertikov.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Bird {
    private List<Egg> eggs = new ArrayList<>();

    public Bird() {
        for (int i = 0; i < Math.round(Math.random() * 10); i++) {
            eggs.add(makeEgg());
        }
    }

    public void checkMyEggs() {
        eggs.forEach(Egg::whoseAmI);
    }

    protected abstract Egg makeEgg();
}
