package com.fertikov.patterns.builder.simple;

public final class SomeObject {
    private final int field1;
    private final String field2;
    private final String field3;

    private SomeObject(int field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public static SomeObjectBuilder builder() {
        return new SomeObjectBuilder();
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }

    public static class SomeObjectBuilder {
        private int field1;
        private String field2;
        private String field3;

        public SomeObjectBuilder field1(int field1) {
            this.field1 = field1;
            return this;
        }

        public SomeObjectBuilder field2(String field2) {
            this.field2 = field2;
            return this;
        }

        public SomeObjectBuilder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public SomeObject build() {
            return new SomeObject(field1, field2, field3);
        }

        private SomeObjectBuilder() {}
    }
}
