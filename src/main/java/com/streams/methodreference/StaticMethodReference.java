package com.streams.methodreference;

import com.streams.Emp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StaticMethodReference {
    public static void main(String[] args) {
        List<String> numbersToString = IntStream.of(100,2000,3000).mapToObj(String::valueOf).toList();
        System.out.println(numbersToString);

        List<String> getNames = Stream.of(new Emp("1","Guru",2000L), new Emp("2", "Kumar",3000L))
                .map(Emp::getName).toList();
        System.out.println(getNames);
    }
}
