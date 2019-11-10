package pl.mlznk.bitjava.projectlombok.tostring;

import lombok.ToString;

@ToString
public class PersonWithToString {

    @ToString.Exclude
    private String name;
    private String surname;

}





