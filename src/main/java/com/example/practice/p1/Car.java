package com.example.practice.p1;

public class Car implements Vehicle, ElectricVehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up!";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }

    @Override
    public String turnAlarmOn() {
        return Vehicle.super.turnAlarmOn() + " " + ElectricVehicle.super.turnAlarmOn();
    }

    @Override
    public String turnAramOff() {
        return ElectricVehicle.super.turnAramOff();
    }

}