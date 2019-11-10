package pl.mlznk.bitjava.projectlombok.nonnull;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;

        if(surname == null) {
            throw new NullPointerException("name is marked as non null value but is null");
        }
        this.surname = surname;
    }

}
