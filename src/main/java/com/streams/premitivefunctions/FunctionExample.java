package com.streams.premitivefunctions;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class FunctionExample {
    public static void main(String[] args) {
        IntFunction<String> function = n -> "The Number is "+n;
        IntStream.range(0,10).mapToObj(function).forEach(System.out::println);
        IntUnaryOperator sqr = n -> (int) Math.pow(n,2);

        IntStream.range(0,10).map(sqr).forEach(System.out::println);

        record Emp(int id, String name){};

        IntFunction<Emp> createEmp =  id -> new Emp(id, "Emp -"+id);

        Emp emp = createEmp.apply(5);
        System.out.println(emp);
    }
}
