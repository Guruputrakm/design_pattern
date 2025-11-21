package com.streams.builtinfucntions;

import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComposeExample {
    public static void main(String[] args) {
        Function<String, String> sanitize = s -> {
            System.out.println("Snitizing");s.trim().toUpperCase(); return s;};
        Function<String , String > validateInput = s -> { System.out.println("validating "); Objects.requireNonNull(s);return s;};
        Function<String , String > processInput = s -> "Processed: name "+s;
        String string = processInput.compose(sanitize).compose(validateInput).apply(" Guru ");
        System.out.println(string);

        Function<Object, Object> fetchEnity =  o ->{
            System.out.println("Fetching enity");
        return o;} ;
        Function<Object, Object> convertToDTO = o -> {
            System.out.println("Converting");
            return o;
        };

        Function<Object, Object> toResponse =  o -> {
            System.out.println("sending the response back");
            return o;
        };

        System.out.println("******************");
        Object newObject = fetchEnity.andThen(convertToDTO).andThen(toResponse).apply("new Object");
        System.out.println(newObject);

        UnaryOperator<Integer> add =  a -> a+a;
        System.out.println(add.apply(5));
        BinaryOperator<Integer> add_1 = Integer::sum;
        System.out.println(add_1.apply(5,10));
    }
}
