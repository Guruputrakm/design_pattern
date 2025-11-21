package com.streams.premitivefunctions;

import java.util.Random;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        IntSupplier supplier = () -> new Random().nextInt(100,200);
        IntConsumer consumer = n -> System.out.println("The generted number is "+n);
        IntStream.generate(supplier).limit(20).forEach(consumer);
        IntBinaryOperator add = (a, b) -> a+b;
        int i = Stream.of(10, 20, 30).reduce(0, (a, b) -> a + b).intValue();
        System.out.println(i);
        int asInt = IntStream.range(0, 10).reduce(add).getAsInt();
        System.out.println(asInt);
    }
}
