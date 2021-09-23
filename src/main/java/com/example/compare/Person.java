package com.example.compare;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int zipCode;

    public Person(String firstName, String lastName, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + printZipCode(zipCode);
    }

    @Override
    public int compareTo(Person other) {
        int cmp = lastName.compareTo(other.lastName);
        if (cmp != 0) {
            return cmp;
        }
        cmp = firstName.compareTo(other.firstName);
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(zipCode, other.zipCode);
    }

    private static String printZipCode(int zipCode) {
        if (zipCode < 10000) {
            return "0" + zipCode;
        }
        return String.valueOf(zipCode);
    }
}
