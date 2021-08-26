package com.example.practice;

class Stats<T extends Number & Comparable> {
    T[] numbers;

    Stats(T[] numbers) {
        this.numbers = numbers;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6 };
        Stats<Integer> iob = new Stats<Integer>(numbers);
        double v = iob.average();
        System.out.println("Average: " + v);

        Double[] numbersOfDouble = { 0.0 };
        Stats<Double> statsDouble = new Stats<Double>(numbersOfDouble);
        v = statsDouble.average();
        System.out.println("Average: " + v);

        String[] arrayOfString = { "1", "2", "3", "4", "5" };
        // Stats<String> statsStr = new Stats<String>(arrayOfString);
    }
}
