package com.example.practice;

enum Apple {

    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price;

    // Constructor
    private Apple(int price) {
        this.price = price;
    }

    private Apple() {
        price = -1;
    }

    public int getPrice() {
        return price;
    }

}