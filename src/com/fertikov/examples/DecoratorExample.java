package com.fertikov.examples;

import com.fertikov.patterns.decorator.*;

public class DecoratorExample {
    public static void main(String[] args) {
        Component component11 = new DecoratorImpl1(new ComponentImpl1());
        Component component12 = new DecoratorImpl1(new ComponentImpl2());
        Component component21 = new DecoratorImpl2(new ComponentImpl1());
        Component component22 = new DecoratorImpl2(new ComponentImpl2());

        component11.action1();
        component11.action2();
        System.out.println();

        component12.action1();
        component12.action2();
        System.out.println();

        component21.action1();
        component21.action2();
        System.out.println();

        component22.action1();
        component22.action2();
        System.out.println();
    }
}
