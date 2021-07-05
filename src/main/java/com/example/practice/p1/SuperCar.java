package com.example.practice.p1;

public class SuperCar {
    public static void main(String[] args) {
        Vehicle superCar = new Car("Citroen");
        System.out.println(superCar.getBrand());
        System.out.println(superCar.speedUp());
        System.out.println(superCar.slowDown());
        System.out.println(superCar.turnAlarmOn());
        System.out.println(superCar.turnAramOff());
        int horsePower = Vehicle.getHorsePower(2500, 480);
        System.out.println(horsePower);
    }
}
