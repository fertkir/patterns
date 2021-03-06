package com.fertikov.examples;

import com.fertikov.patterns.creational.factorymethod.Bird;
import com.fertikov.patterns.creational.factorymethod.Chicken;
import com.fertikov.patterns.creational.factorymethod.Pigeon;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        Bird pigeon = new Pigeon();

        System.out.println("Chicken is checking it's eggs");
        chicken.checkMyEggs();

        System.out.println();

        System.out.println("Pigeon is checking it's eggs");
        pigeon.checkMyEggs();
    }
}
