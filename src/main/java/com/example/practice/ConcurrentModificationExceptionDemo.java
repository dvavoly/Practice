package com.example.practice;

import java.util.ArrayList;
import java.util.Collections;

class Demo {
    public void show() {
        final var list = new ArrayList<String>();
        list.add("Banana");
        list.add("Apple");
        // List<String> list = List.of("Banana", "Apple");
        var itr = list.iterator();

        Collections.sort(list);
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        var demo = new Demo();
        demo.show();
    }
}
