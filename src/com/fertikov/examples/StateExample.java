package com.fertikov.examples;

import com.fertikov.patterns.behavioral.state.StateContext;

public class StateExample {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.print("first");
        stateContext.print("second");
        stateContext.print("third");
        stateContext.print("fourth");
        stateContext.print("fifth");
        stateContext.print("sixth");
        stateContext.print("seventh");
    }
}
