package com.fertikov.examples;

import com.fertikov.patterns.behavioral.iterator.Iterator;
import com.fertikov.patterns.behavioral.iterator.MyList;

public class IteratorExample {
    public static void main(String[] args) {
        MyList list = new MyList(5);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(2);
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
