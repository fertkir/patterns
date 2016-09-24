package com.fertikov.patterns.structural.composite;

import java.util.HashSet;
import java.util.Set;

public class Department implements WorkingUnit {

    private final Set<WorkingUnit> employees = new HashSet<>();

    public void hireEmployee(WorkingUnit employee) {
        employees.add(employee);
    }

    public void dismissEmployee(WorkingUnit employee) {
        employees.remove(employee);
    }

    @Override
    public void work() {
        employees.forEach(WorkingUnit::work);
    }
}
