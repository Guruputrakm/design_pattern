package com.streams.practice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeCode {
    public static void main(String[] args) {
        List<String> namesOfEmpWithFiter = getNamesOfEmpWithFiter(List.of(
                new Employee("Guru", "IT", 6, 55000, true),
                new Employee("Amar", "Finance", 4, 48000, true),
                new Employee("Kiran", "HR", 7, 42000, false),
                new Employee("Sunil", "IT", 8, 60000, true)
        ));
        //System.out.println(namesOfEmpWithFiter);

        System.out.println(
                getWords(List.of(
                "Hello world!",
                "World of streams_.",
                "hello_ Java, hello Streams"
        ))
        );
        List<List<Integer>> nested = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9,10)
        );
        System.out.println(practice3(nested));
    }

   static List<String> getNamesOfEmpWithFiter(List<Employee> employees) {
        return employees.stream()
                .filter(Employee::isActive)
                .filter(employee -> employee.getYearsOfExperience() > 5)
                .filter(employee -> employee.getSalary() > 40_000)
                .map(e -> Optional.ofNullable(e.getName()).orElse("UNKNOWN"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
       // System.out.println(list);
    }

    public static List<Integer> practice3(List<List<Integer>> lists) {
        List<Integer> list = lists.stream().flatMapToInt(integers -> integers.stream().mapToInt(Integer::intValue))
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return list;
    }
    public static List<String> getWords(List<String> list) {
       /* List<String> list1 = list.stream()
                .flatMap(l -> Arrays.stream(l.split(" ")))
                .map(String::toLowerCase)
                .sorted()
                .distinct()
                .peek(System.out::println)
                .toList(); */
        List<String> list2 = list.stream()
                .flatMap(l -> Arrays.stream(l.split("\\W+")))
                .map(s -> s.replaceAll("[^a-zA-Z0-9]", ""))
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();
/*

        List<String> list3 = list.stream()
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .filter(word -> !word.isBlank())
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();
*/
        return list2;
    }

}
