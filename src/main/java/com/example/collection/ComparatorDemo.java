package com.example.collection;

import java.util.Comparator;
import java.util.TreeSet;

class ReverseStringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }

}

public class ComparatorDemo {
    public static void main(String[] args) {
        // var ts = new TreeSet<String>(new ReverseStringComparator());

        Comparator<? super String> reverseComparator = (s1, s2) -> s2.compareTo(s1);
        var ts = new TreeSet<String>(reverseComparator);
        // var ts = new TreeSet<String>();

        // Add elements to the set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (var element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
