package com.example.lambda;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] values, MyFunctional<T> f, T v) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (f.func(values[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        // Create an array of HighTemp objects
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83) };
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");
    }
}
