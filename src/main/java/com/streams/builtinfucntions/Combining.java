package com.streams.builtinfucntions;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Combining {
    public static void main(String[] args) {
        Predicate<Integer> isEvevn = n->n%2==0;
        Predicate<Integer> isGreaterThen10 = n -> n>10;

        System.out.println(isEvevn.and(isGreaterThen10).test(25));
        System.out.println(isEvevn.or(isGreaterThen10).test(5));

        Function<Integer, Integer> mutiplyBy2 = n -> n*2;
        Function<Integer, Double> square = n -> Math.pow(n, 2);

        System.out.println(mutiplyBy2.andThen(square).apply(4));

        Function<String, String > welcome = (name) -> "welcome "+name;
        Function<String , String > beforeAfter = str -> "Nice to meet you "+str;

        System.out.println(welcome.andThen(beforeAfter).apply("Guruputra K M"));
        System.out.println(welcome.compose(beforeAfter).apply("Guruputra"));
    }
}
