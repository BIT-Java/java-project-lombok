package pl.mlznk.bitjava.projectlombok.nonnull;

import lombok.NonNull;

public class PersonWithNonNull {

    private String name;
    private String surname;

    public PersonWithNonNull(String name, @NonNull String surname) {
        this.name = name;
        this.surname = surname;
    }

}






