package com.streams.premitivefunctions;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class ImpPractice {
    static Emp1[] emp1s = new Emp1[]{
            new Emp1("Guru",20_000),
            new Emp1("Kiran",40_000),
            new Emp1("Sunil",10_000),
            new Emp1("Amar",20_000)};

    public static void main(String[] args) {
        IntPredicate eligbleSalary = sal -> sal <30_000;
        IntUnaryOperator applyHike = sal -> (int) (sal+ (sal*0.1));
       // IntConsumer print = System.out::println;
        List<Emp1> collect = Arrays.stream(emp1s).map(e -> {
            if (eligbleSalary.test(e.getSalary())) {
                return new Emp1(e.getName(), applyHike.applyAsInt(e.getSalary()));
            } else {
                return e;
            }
        }).collect(Collectors.toUnmodifiableList());
        collect.forEach(System.out::println);

        IntSummaryStatistics intSummaryStatistics = collect.stream().mapToInt(Emp1::getSalary).summaryStatistics();
        System.out.printf("Total = %d, Avg= %.2f, Count =%d%n", intSummaryStatistics.getSum(), intSummaryStatistics.getAverage(), intSummaryStatistics.getCount());

    }
}
