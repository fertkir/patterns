package com.fertikov.patterns.templatemethod;

public class ConcreteAlgorithm1 extends AbstractAlgorithm {

    @Override
    protected String prepareSpecialString() {
        return "World";
    }
}
