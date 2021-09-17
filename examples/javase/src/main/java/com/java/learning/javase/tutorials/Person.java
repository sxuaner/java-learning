package com.java.learning.javase.tutorials;
import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    // Local means no timezone
    private final LocalDate dob;

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    // omitting getters for brevity
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && dob.equals(p.dob);
    }
}
