package com.fertikov.patterns.creational.builder.inherited;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Manager extends Employee {
    private final List<Employee> subordinates;

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    Manager(ManagerBuilder builder) {
        super(builder);
        this.subordinates = unmodifiableList(new ArrayList<>(builder.subordinates));
    }

    public static ManagerBuilder builder() {
        return new ManagerBuilder();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manager{")
                .append(super.toString())
                .append(", subordinates=[\n");
        subordinates.forEach(employee -> sb.append("  ").append(employee.toString()).append("\n"));
        sb.append("]}");
        return sb.toString();
    }

    public static class ManagerBuilder extends EmployeeBuilder<ManagerBuilder> {
        private final List<Employee> subordinates = new ArrayList<>();

        public ManagerBuilder subordinate(Employee employee) {
            subordinates.add(employee);
            return this;
        }

        @Override
        protected ManagerBuilder getThis() {
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }
}
