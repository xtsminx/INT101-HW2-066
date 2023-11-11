package work02;
import work01.Utilitor;

import java.util.Objects;

public class Person {
    private static int nextId = 1;
    private int id;
    private String firstname;
    private String lastname;
    public Person(String firstname , String lastname){
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        this.id = nextId;
        nextId++;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person (id= ").append(id).append(", firstname = ").append(firstname).append(", lastname = ").append(lastname).append(" )");
        return sb.toString();
    }

    public int getId() {return id;}
    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
