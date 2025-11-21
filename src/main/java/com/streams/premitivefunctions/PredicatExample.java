package com.streams.premitivefunctions;

import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PredicatExample {
    public static void main(String[] args) {
        IntPredicate evenorOdd = n -> n%2 == 0;
        IntConsumer consumer = n -> System.out.printf("%d ,", n);
        long time = new Date().getTime();
        int[] array = IntStream.range(0, 100000000).filter(evenorOdd).toArray();
        Arrays.stream(array).forEach(consumer);
        long after = new Date().getTime();
        System.out.println("time take is in ms "+(after-time));
    }
}
