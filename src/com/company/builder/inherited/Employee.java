package com.company.builder.inherited;

import java.time.LocalDate;

/**
 * Base class
 */
public abstract class Employee {
    private final int id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthday = builder.birthday;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday;
    }

    abstract static class EmployeeBuilder<T extends EmployeeBuilder> {
        private int id;
        private String name;
        private String surname;
        private LocalDate birthday;

        protected abstract T getThis();

        public abstract Employee build();

        public T id(int id) {
            this.id = id;
            return getThis();
        }

        public T name(String name) {
            this.name = name;
            return getThis();
        }

        public T surname(String surname) {
            this.surname = surname;
            return getThis();
        }

        public T birthday(LocalDate birthday) {
            this.birthday = birthday;
            return getThis();
        }
    }
}
