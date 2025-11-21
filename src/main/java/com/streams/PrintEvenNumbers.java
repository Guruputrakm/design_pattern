package com.streams;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Numbers extends Stream {
    boolean evenNumber(int a);
}
public class PrintEvenNumbers {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 10, 90, 18, 25, 16);
        integers.stream().filter(n -> n%2 ==0).forEach(System.out::println);
      // new Thread( () -> IntStream.rangeClosed(1,5).forEach(System.out::println)).start();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> IntStream.rangeClosed(1,5).forEach(System.out::println));
    }

}
