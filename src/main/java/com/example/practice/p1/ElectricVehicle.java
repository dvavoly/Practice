package com.example.practice.p1;

public interface ElectricVehicle {

    default String turnAlarmOn() {
        return "Turning the electric vehicle alarm on.";
    }

    default String turnAramOff() {
        return "turning the electric vehicle alarm off.";
    }

}
