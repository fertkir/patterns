package com.fertikov.patterns.builder.inherited;

public class Developer extends Employee {
    private final String language;
    private final boolean hasCertificate;

    Developer(DeveloperBuilder builder) {
        super(builder);
        this.language = builder.language;
        this.hasCertificate = builder.hasCertificate;
    }

    public String getLanguage() {
        return language;
    }

    public boolean hasCertificate() {
        return hasCertificate;
    }

    public static DeveloperBuilder builder() {
        return new DeveloperBuilder();
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() +
                ", language='" + language + '\'' +
                ", hasCertificate=" + hasCertificate +
                '}';
    }

    public static class DeveloperBuilder extends EmployeeBuilder<DeveloperBuilder> {
        private String language;
        private boolean hasCertificate;

        public DeveloperBuilder language(String language) {
            this.language = language;
            return this;
        }

        public DeveloperBuilder hasCertificate(boolean hasCertificate) {
            this.hasCertificate = hasCertificate;
            return this;
        }

        @Override
        protected DeveloperBuilder getThis() {
            return this;
        }

        @Override
        public Developer build() {
            return new Developer(this);
        }
    }
}

