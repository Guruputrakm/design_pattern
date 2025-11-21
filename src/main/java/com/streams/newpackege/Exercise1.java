package com.streams.newpackege;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {2,5,1,20,38,69};
        IntStream.of(array).filter( i -> i%2==0)
                .map( i-> i*i)
                //.peek(System.out::println)
                .forEach(System.out::println);
    }
}
