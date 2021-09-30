package com.example.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        var ll = new LinkedList<String>();
        // Add element to linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Original content of 'll': " + ll);

        // Remove elements from the linked list
        ll.remove("F");
        ll.remove(2);

        System.out.println("Content of 'll' after deletions: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("'ll' after deleting first and last" + ll);

        // Get and Set a value
        String value = ll.get(2);
        ll.set(2, value + " Changed");
        System.out.println("'ll' after change: " + ll);
        
    }
}
