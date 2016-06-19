package com.fertikov.patterns.behavioral.state;

class UppercaseState implements Statelike {
    @Override
    public void print(StateContext stateContext, String value) {
        System.out.println(value.toUpperCase());
        stateContext.setState(new RegularState());
    }
}
