package com.fertikov.patterns.structural.adapter;

public class DatePrinter {
    public void printDate(NewInterface dateGetter) {
        System.out.println(dateGetter.getDate());
    }
}
