package com.example.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testReverseString() {
        assertEquals("reviver", ReverseString.reverseString("reviver"));
    }

    @Test
    void testReverseStringWithArray() {
        assertEquals("cba", ReverseString.reverseStringWithArray("abc"));
    }
}
