package com.example.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        // First obtain a path to the file
        // Next, obtain a channel to that file within a try-with-resource block
        try (SeekableByteChannel fileChannel = Files.newByteChannel(Path.of("test.txt"))) {
            // Allocate a buffer
            ByteBuffer buffer = ByteBuffer.allocate(128);

            int count = 0; 
            while (count != -1) {

                count = fileChannel.read(buffer);
                buffer.rewind();

                while (count > 0) {
                    System.out.print((char) buffer.get());
                    count--;
                }
            }
        } catch (IOException ex) {
            System.out.println("I/O Exception: " + ex.getMessage());
        }
    }
}
