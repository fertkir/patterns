package com.fertikov.patterns.templatemethod;

public abstract class AbstractAlgorithm {

    protected abstract String prepareSpecialString();

    public void execute() {
        System.out.println("Hello, " + prepareSpecialString() + "!");
    }
}
