package com.example.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> harryPotter = new ArrayList<>();
        harryPotter.add(new Person("Harry", "Potter", 4050));
        harryPotter.add(new Person("Albus", "Dumbledore", 2020));
        harryPotter.add(new Person("Hermione", "Granger", 91819));
        harryPotter.add(new Person("Sirius", "Black", 1001));
        harryPotter.add(new Person("Nymphadora", "Tonks", 56016));

        System.out.println(harryPotter);
        Collections.sort(harryPotter);
        System.out.println(harryPotter);
    }
}
