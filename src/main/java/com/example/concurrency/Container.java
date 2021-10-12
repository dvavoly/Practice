package com.example.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Container {

    static final List<String> list = new ArrayList<>();

    synchronized void addEntry(String s) {
        list.add(s);
    }

    int size() {
        return list.size();
    }
}
