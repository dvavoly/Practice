package com.example.io;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {
            long fileSize = fileChannel.size();
            MappedByteBuffer mappedBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);
            for (int index = 0; index < fileSize; index++) {
                System.out.print((char) mappedBuffer.get());
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
