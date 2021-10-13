package com.example.practice;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        var r = new Random();
        double val;
        double sum = 0;
        var bell = new int[10];

        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for (int j = 0; j < 10; j++, t += 0.5) {
                if (val < t) {
                    bell[j]++;
                    break;
                }
            }
        }

        System.out.println("Average of values: " + (sum / 100));
        for (int i = 0; i < bell.length; i++) {
            for (int index = bell[i]; index > 0; index--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
