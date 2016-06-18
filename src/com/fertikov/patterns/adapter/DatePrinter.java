package com.fertikov.patterns.adapter;

public class DatePrinter {
    public void printDate(NewInterface dateGetter) {
        System.out.println(dateGetter.getDate());
    }
}
