package com.example.stream;

public class AutoCloseableResourceSecond implements AutoCloseable {

    public AutoCloseableResourceSecond() {
        System.out.println("Constructor -> AutoCloseableResource_Second");
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResource_Second");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed -> AutoCloseableResource_Second");
    }
}
