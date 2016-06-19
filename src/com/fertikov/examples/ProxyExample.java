package com.fertikov.examples;

import com.fertikov.patterns.structural.proxy.Component;
import com.fertikov.patterns.structural.proxy.ComponentImpl;
import com.fertikov.patterns.structural.proxy.ComponentLoggingProxy;

public class ProxyExample {
    public static void main(String[] args) {
        run(false);
        System.out.println();
        run(true);
    }

    private static void run(boolean withLogging) {
        Component component = withLogging ? new ComponentLoggingProxy() : new ComponentImpl();
        component.doSmth();
    }
}
