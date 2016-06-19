package com.fertikov.patterns.behavioral.iterator;

public interface Iterator<E> {
    boolean hasNext();
    E next();
}
