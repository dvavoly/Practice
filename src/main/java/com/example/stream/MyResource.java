package com.example.stream;

public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }

}
