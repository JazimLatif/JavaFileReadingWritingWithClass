package com.jazimlatif;

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    public Person(String id, String firstName, String lastName, String email, String gender) {
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
