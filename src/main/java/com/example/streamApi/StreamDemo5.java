package com.example.streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record NamePhoneEmail(String name, String phone, String email) {
}

record NamePhone(String name, String phone) {
}

public class StreamDemo5 {
    public static void main(String[] args) {
        // A list of name, phone numbers, and e-mail addresses.
        List<NamePhoneEmail> myList = List.of(
                new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchild.com"),
                new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"),
                new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));
        System.out.println("Original values in myList: ");
        myList.forEach(a -> {
            System.out.println(a.name() + " " + a.phone() + " " + a.email());
        });

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name(), a.phone()));
        System.out.println("\nList of name and phone numbers:");
        // nameAndPhone.forEach(a -> {
        // System.out.println(a.name() + " " + a.phone());
        // });
        // List<NamePhone> collectOfNameAndPhone = nameAndPhone.collect(Collectors.toList());
        List<NamePhone> collectOfNameAndPhone = nameAndPhone.toList();
        for (var element : collectOfNameAndPhone) {
            System.out.println(element);
        }
    }
}
