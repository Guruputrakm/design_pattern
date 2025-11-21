package com.streams.newpackege;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.builder;

public class Excesise4 {
    public static void main(String[] args) {

        List<String> list = Stream.<String>builder().add("Guru").add("Kiran").build()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }
}
