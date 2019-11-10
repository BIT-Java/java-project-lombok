package pl.mlznk.bitjava.projectlombok.requiredargsconstructor;

import lombok.*;

@Data
public class Person {

    public static Person of(String name, String surname) {
        return new Person(name, surname);
    }

    private String name;
    private String surname;

    private Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
