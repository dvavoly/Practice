package com.example.streamApi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamDemoTest {
    @Test
    void infiniteStreamTest() {
        // given
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);

        // when
        List<Integer> collect = infiniteStream
                // .skip(10)
                .limit(10)
                .toList();

        // than
        assertEquals(collect, List.of(0, 2, 4, 6, 8, 10, 12, 14, 16, 18));
    }

    @Test
    void intersectionOfTwoListsOfStringTest() {
        // given
        List<String> list = List.of("red", "blue", "blue", "green", "red");
        List<String> otherList = List.of("red", "green", "green", "yellow");

        // when
        Set<String> result = list.stream()
                .distinct()
                .filter(otherList::contains)
                .collect(Collectors.toSet());
        // than
        Set<String> commonElement = Set.of("red", "green");

        assertEquals(commonElement, result);
    }
}
