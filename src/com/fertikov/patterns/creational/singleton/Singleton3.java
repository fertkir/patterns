package com.fertikov.patterns.creational.singleton;

/**
 * Thread-safe lazy singleton without exception handling
 */
public class Singleton3 {
    public static Singleton3 getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final Singleton3 instance = new Singleton3();
    }

    private Singleton3() {}
}
