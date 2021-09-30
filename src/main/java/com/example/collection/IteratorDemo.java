package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        var al = new ArrayList<String>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("Original contents is: " + al);
        var iterator = al.iterator();
        System.out.print("[");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println("]");

        // Modify objects being iterated
        ListIterator<String> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Now display the list backward
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }
        System.out.println();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
    }
}
