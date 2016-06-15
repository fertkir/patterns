package com.company.singleton.singletons;

/**
 * Thread-safe eager singleton without exception handling
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {
        return instance;
    }

    private Singleton2() {}
}
