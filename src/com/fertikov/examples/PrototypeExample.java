package com.fertikov.examples;

import com.fertikov.patterns.creational.prototype.Prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Prototype prototype1 = new Prototype();
        Prototype prototype2 = prototype1.copy();
        System.out.println(prototype1.getState() == prototype2.getState());
    }
}
