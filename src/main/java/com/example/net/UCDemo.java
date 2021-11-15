package com.example.net;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        URL address = new URL("https://www.google.com");
        URLConnection addressConnection = address.openConnection();

        // get date
        long date = addressConnection.getDate();
        System.out.println("Date: " + new Date(date));
        System.out.println("Content-Type: " + addressConnection.getContentType());
        date = addressConnection.getExpiration();
        System.out.println("Expires: " + new Date(date));
        date = addressConnection.getLastModified();
        System.out.println("Last-Modified: " + new Date(date));
        long contentLength = addressConnection.getContentLengthLong();
        System.out.println("Content length: " + contentLength);
        if (contentLength != 0) {
            System.out.println("--- Content ---");
            var inputStream = addressConnection.getInputStream();
            int c = 0;
            while (c != -1) {
                c = inputStream.read();
                System.out.print((char) c);
            }
            inputStream.close();
        } else {
            System.out.println("No content available");
        }
    }
}
