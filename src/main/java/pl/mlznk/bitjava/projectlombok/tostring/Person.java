package pl.mlznk.bitjava.projectlombok.tostring;

public class Person {

    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Person(name=" + this.name + ", surname=" + this.surname + ")";
    }

}
