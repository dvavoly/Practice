package com.example.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class TComp implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int i, j, k;
        // Find index of beginning of last name
        i = s1.lastIndexOf(' ');
        j = s2.lastIndexOf(' ');
        k = s1.substring(i).compareToIgnoreCase(s2.substring(j));
        if (k == 0) {   // last name match, check entire name
            return s1.compareToIgnoreCase(s2);
        } else {
            return k;
        }
    }
}

public class TreeMapDemoTwo {
    public static void main(String[] args) {
        var tm = new TreeMap<String, Double>(new TComp());

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Entry<String, Double>> set = tm.entrySet();

        for (var element : set) {
            System.out.println(element.getKey() + " : " + element.getValue());
        }

        System.out.println();

        double deposit = tm.get("John Doe");
        tm.put("John Doe", deposit + 1000);
        System.out.println("John Doe's new balance is: " + tm.get("John Doe"));
    }
}
