package com.streams.builtinfucntions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllFunctionalInterfaceExample {

    public static void main(String[] args) {
        Predicate<Integer> evenNumber = n ->n %2 ==0;
        Function<String ,Integer> getLengthOfString = s ->s.length();
        Consumer<String> sideEffect = s -> System.out.println("This is side effect of "+s);
        Supplier<Double> randomNumber = () ->Math.random();

        System.out.println(evenNumber.test(25));
        System.out.println(getLengthOfString.apply("Guruputra"));
        sideEffect.accept("NewString"); // No Sout since no return from acceptmethod
        System.out.println(randomNumber.get());




        Function<String, String > welcome = (name) -> "welcome "+name;
        Function<String , String > beforeAfter = str ->   " Nice to meet you "+str;
       // System.out.println(welcome.andThen(beforeAfter).apply("Guruputra K M"));
        System.out.println(welcome.compose(beforeAfter).apply("Guruputra K M"));

       
;    }
}
