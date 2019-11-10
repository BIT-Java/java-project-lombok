package pl.mlznk.bitjava.projectlombok.equalshashcode;

public class Person {

    private String name;
    private String surname;

    @Override public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result*PRIME) + super.hashCode();
        result = (result*PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result*PRIME) + (this.surname == null ? 43 : this.surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        if (this.name != other.name) return false;
        if (this.surname != other.surname) return false;
        return true;
    }


    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

}
