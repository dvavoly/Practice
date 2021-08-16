package com.example.stream;

public class AutoCloseableResourceFirst implements AutoCloseable {

    public AutoCloseableResourceFirst() {
        System.out.println("Constructor -> AutoCloseableResource_First");
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResource_FIrst");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed -> AutoCloseableResource_FIrst");
    }

}
