package com.example.net;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL address = new URL("https://www.bbc.com/ukrainian/");

        System.out.println("Protocol: " + address.getProtocol());
        System.out.println("Port: " + address.getPort());

        System.out.println("Host: " + address.getHost());
        System.out.println("File: " + address.getFile());
        System.out.println("Ext: " + address.toExternalForm());
    }
}
