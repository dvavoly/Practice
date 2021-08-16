package com.example.stream;

public class AutoCloseableMain {
    public static void main(String[] args) {
        orderOfClosingResources();
    }

    private static void orderOfClosingResources() {
        try (var af = new AutoCloseableResourceFirst(); var as = new AutoCloseableResourceSecond()) {
            af.doSomething();
            as.doSomething();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
