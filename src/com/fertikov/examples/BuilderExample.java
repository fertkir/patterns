package com.fertikov.examples;

import com.fertikov.patterns.creational.builder.inherited.Developer;
import com.fertikov.patterns.creational.builder.inherited.Manager;
import com.fertikov.patterns.creational.builder.simple.SomeObject;

import static java.time.LocalDate.of;

public class BuilderExample {

    public static void main(String[] args) {
        SomeObject someObject = SomeObject.builder()
                .field1(123)
                .field2("456")
                .field3("789")
                .build();
        System.out.println(someObject);
        System.out.println();

        Developer javaDeveloper = Developer.builder()
                .id(1)
                .name("Ivan")
                .surname("Ivanov")
                .birthday(of(1990, 10, 11))
                .language("Java")
                .hasCertificate(false)
                .build();
        Developer cppDeveloper = Developer.builder()
                .id(2)
                .name("Petr")
                .surname("Petrov")
                .birthday(of(1980, 3, 23))
                .language("C++")
                .hasCertificate(true)
                .build();
        Manager manager = Manager.builder()
                .id(3)
                .name("Sidor")
                .surname("Sidorov")
                .birthday(of(1970, 1, 20))
                .subordinate(javaDeveloper)
                .subordinate(cppDeveloper)
                .build();
        System.out.println(manager);
    }
}
