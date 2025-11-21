package com.streams.newpackege;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class TestCases {

    @Test
    public void testSequence(){
        int[] array = {2,5,1,20,38,69};
        int[] array1 = IntStream.of(array).filter(i -> i % 2 == 0)
                .map(i -> i * i).toArray();
        int[] expected = {4, 400, 1444};
        Assert.assertArrayEquals(array1,expected);
    }
}
