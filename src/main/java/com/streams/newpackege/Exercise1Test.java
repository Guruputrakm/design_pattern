package com.streams.newpackege;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @org.testng.annotations.Test
    void testSquareEvenNumbers() {
        int[] array = {2, 5, 1, 20, 38, 69};

        List<Integer> result = IntStream.of(array)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)         // prefer i*i over Math.pow
                .boxed()
                .collect(Collectors.toList());

        // even numbers: 2,20,38 -> squares: 4, 400, 1444
        List<Integer> expected = List.of(4, 400, 1444);
        assertEquals(expected, result);
    }
}
