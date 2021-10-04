package com.example.collection;

import java.util.Comparator;
import java.util.TreeMap;

class ComparingByLastName implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        var indexLastName1 = s1.lastIndexOf(' '); // Find index of beginning of last name
        var indexLastName2 = s2.lastIndexOf(' ');
        return s1.substring(indexLastName1).compareToIgnoreCase(s2.substring(indexLastName2));
    }

}

class ComparingThanByFirstName implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}

public class TreeMapDemoTwoA {
    public static void main(String[] args) {
        // ComparingByLastName comparingByLastName = new ComparingByLastName();
        // Comparator<String> comparingByLastThanFirstName = comparingByLastName
        // .thenComparing(new ComparingThanByFirstName());
        // var tm = new TreeMap<String, Double>(comparingByLastThanFirstName);
        var tm = new TreeMap<String, Double>(
                new ComparingByLastName().thenComparing((s1, s2) -> s1.compareToIgnoreCase(s2)));

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        for (var element : tm.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}
