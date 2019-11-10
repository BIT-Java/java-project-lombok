package pl.mlznk.bitjava.projectlombok.builder;

public class Person {

    private String name;
    private String surname;
    private int age;
    private boolean employee;

    private Person(String name, String surname, int age, boolean employee) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.employee = employee;
    }

    public static class PersonBuilder {

        private String name;
        private String surname;
        private int age;
        private boolean employee;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder employee(boolean employee) {
            this.employee = employee;
            return this;
        }

        public Person build() {
            return new Person(name, surname, age, employee);
        }

    }

}
