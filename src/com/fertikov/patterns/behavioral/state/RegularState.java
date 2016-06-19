package com.fertikov.patterns.behavioral.state;

class RegularState implements Statelike {

    private static final int FREQUENCY = 3;

    private int count = 1;

    @Override
    public void print(StateContext stateContext, String value) {
        System.out.println(value);
        if (++count >= FREQUENCY) {
            stateContext.setState(new UppercaseState());
        }
    }
}
