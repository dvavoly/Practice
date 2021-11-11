package com.example.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("test.txt"),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            // Create a buffer
            ByteBuffer buffer = ByteBuffer.allocate(26);

            // Write some bytes to the buffer
            for (int i = 0; i < buffer.limit(); i++) {
                buffer.put((byte) ('A' + i));
            }
            // Reset the buffer, so that it can be written
            buffer.rewind();

            // Write the buffer to the output file
            fileChannel.write(buffer);

        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
