package com.fertikov.patterns.behavioral.iterator;

public class MyList implements Iterable<Integer> {

    private int[] values;
    private int cursor = 0;

    public MyList(int size) {
        values = new int[size];
    }

    public void add(int value) {
        if (cursor == values.length) {
            throw new IllegalStateException("The list is full");
        }
        values[cursor++] = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<Integer> {
        private int current;

        @Override
        public boolean hasNext() {
            return current < values.length;
        }

        @Override
        public Integer next() {
            return values[current++];
        }
    }
}
