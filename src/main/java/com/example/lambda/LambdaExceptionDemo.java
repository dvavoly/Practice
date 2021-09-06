package com.example.lambda;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        var values = new double[] { 1.0, 2.0, 3.0, 4.0 };

        DoubleNumericArrayFunc average = n -> {

            if (n.length == 0){
                throw new EmptyArrayException();
            }

            double sum = 0;
            for (double d : values) {
                sum += d;
            }
            return sum / n.length;
        };
        try {
            System.out.println("The average is: " + average.func(values));
            System.out.println("The average is: " + average.func(new double[0]));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

}
