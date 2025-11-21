package com.streams;

@FunctionalInterface
interface Calculator {
    int cal(int a, int b);
}
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a+b;
        Calculator sub = (a,b)  -> a-b;

        add.cal(10,23);
        System.out.println(add);
        System.out.println(sub);

    }
}
