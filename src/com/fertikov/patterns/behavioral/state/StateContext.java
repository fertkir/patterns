package com.fertikov.patterns.behavioral.state;

public class StateContext {
    private Statelike state = new RegularState();

    void setState(Statelike state) {
        this.state = state;
    }

    public void print(String value) {
        state.print(this, value);
    }
}
