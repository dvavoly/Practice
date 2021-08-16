package com.example.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CopyFileTest {

    @Test
    void testDemoSuppressedException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            CopyFile.demoSuppressedException("/non-existent-path/non-existent-file.txt");
        });
    }
}
