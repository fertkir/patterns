package com.fertikov.examples;

import com.fertikov.patterns.structural.adapter.DatePrinter;
import com.fertikov.patterns.structural.adapter.LegacyInterfaceImpl;
import com.fertikov.patterns.structural.adapter.NewInterfaceAdapter;

public class AdapterExample {
    public static void main(String[] args) {
        new DatePrinter().printDate(new NewInterfaceAdapter(new LegacyInterfaceImpl()));
    }
}
