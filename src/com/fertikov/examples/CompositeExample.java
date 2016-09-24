package com.fertikov.examples;

import com.fertikov.patterns.structural.composite.Department;
import com.fertikov.patterns.structural.composite.Manager;
import com.fertikov.patterns.structural.composite.Programmer;
import com.fertikov.patterns.structural.composite.Tester;

public class CompositeExample {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Tester tester = new Tester();
        Manager manager = new Manager();

        Department department = new Department();
        department.hireEmployee(programmer);
        department.hireEmployee(tester);
        department.hireEmployee(manager);
        department.work();

        System.out.println();
        department.dismissEmployee(manager);
        department.work();
    }
}
