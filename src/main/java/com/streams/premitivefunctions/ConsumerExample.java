package com.streams.premitivefunctions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class ConsumerExample {
    public static void main(String[] args) {
        IntConsumer consumer = n -> System.out.println("The provided number is "+n);
        consumer.accept(5);
        IntStream.iterate(0, i -> (i < 20), i -> i+1 ).forEach(consumer);

        int[] array = {5,10,2,6};
        String name = "-1236";
        IntStream intStream;
        if( name.startsWith("-")){
            intStream = IntStream.range(1, name.length());
        }else {
            intStream = IntStream.range(0, name.length());
        }
        int reduce = intStream.map(i -> name.charAt(i) - '0')
                .reduce(0, (acc, digit) -> acc * 10 + digit);
        if(name.startsWith("-")) {
            reduce = reduce *-1;
        }
        System.out.println(reduce);

    }

    public static char convert(int i) {
        return (char) i;
    }
}
