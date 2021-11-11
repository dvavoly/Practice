package com.example.io;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MappedChanelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("test.txt"), StandardOpenOption.READ,
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            // Map the file into a buffer
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            // Write some bytes to the buffer
            for (int i = 0; i < buffer.limit(); i++) {
                buffer.put((byte) ('A' + i));
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
