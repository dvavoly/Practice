package com.example.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) {
        int c = 0;
        // Create a socket connected to internic.net.port 43
        try (final Socket socket = new Socket("lookup.icann.org", 43)) {
            // Obtain input and output streams
            final InputStream inputStream = socket.getInputStream();
            final OutputStream outputStream = socket.getOutputStream();

            String internetAddress = "www.oracle.com";
            byte[] request = internetAddress.getBytes();
            // Send request
            outputStream.write(request);
            // Read and display response

            while (c != -1) {
                c = inputStream.read();
                System.out.println((char) c);
            }

        } catch (IOException e) {
            System.out.println("Socket not found: " + e.getMessage());
        }
    }
}
