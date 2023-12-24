package com.jentech3;

import java.util.Objects;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;

    public Person(int id, String firstName, String lastName, String gender, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName, String gender, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
