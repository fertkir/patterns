package com.fertikov.patterns.creational.singleton;

/**
 * Thread-safe double-checking lazy singleton
 */
public class Singleton5 {
    private static volatile Singleton5 instance;

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    private Singleton5() {}
}
