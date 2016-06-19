package com.fertikov.patterns.behavioral.templatemethod;

public abstract class AbstractAlgorithm {

    protected abstract String prepareSpecialString();

    public void execute() {
        System.out.println("Hello, " + prepareSpecialString() + "!");
    }
}
