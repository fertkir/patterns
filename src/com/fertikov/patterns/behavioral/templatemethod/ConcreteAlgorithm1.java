package com.fertikov.patterns.behavioral.templatemethod;

public class ConcreteAlgorithm1 extends AbstractAlgorithm {

    @Override
    protected String prepareSpecialString() {
        return "World";
    }
}
