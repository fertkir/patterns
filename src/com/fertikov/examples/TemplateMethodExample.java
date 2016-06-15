package com.fertikov.examples;

import com.fertikov.patterns.templatemethod.AbstractAlgorithm;
import com.fertikov.patterns.templatemethod.ConcreteAlgorithm1;
import com.fertikov.patterns.templatemethod.ConcreteAlgorithm2;

import static java.util.Arrays.asList;

public class TemplateMethodExample {
    public static void main(String[] args) {
        asList(new ConcreteAlgorithm1(), new ConcreteAlgorithm2())
                .forEach(AbstractAlgorithm::execute);
    }
}
