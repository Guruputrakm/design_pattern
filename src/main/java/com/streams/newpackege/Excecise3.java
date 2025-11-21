package com.streams.newpackege;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excecise3 {
    public static void main(String[] args) {
       // Stream.generate(Math::random).limit(5).forEach(System.out::println);
        Random random = new Random(122251100);
        IntStream.generate(random::nextInt).filter(numer -> !(numer < 0)).limit(5).sorted()
                .boxed()
                .map(n -> (Number)n)
                .map(n -> (Integer)n)
                .forEach(System.out::println);

        // takewhile example
        int[] array = {1,10,16,51,95};
        IntStream.of(array).takeWhile(item -> item <= 51).forEach(System.out::println);
       /* List<Integer> list = IntStream.of(array).dropWhile(item -> item <= 51).mapToInt().toList();
        System.out.println(list);*/
    }
}
