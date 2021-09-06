package com.example.lambda;

public class HighTemp {

    private int highTemp;

    public HighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    // Return true if the invoking HighTemp object has the same temperature
    boolean sameTemp(HighTemp highTemp) {
        return this.highTemp == highTemp.highTemp;
    }

    boolean lessThanTemp(HighTemp highTemp) {
        return this.highTemp < highTemp.highTemp;
    }
}
