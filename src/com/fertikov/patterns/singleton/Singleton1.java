package com.fertikov.patterns.singleton;

/**
 * Non-thread-safe lazy singleton
 */
public class Singleton1 {
    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    private Singleton1() {}
}
