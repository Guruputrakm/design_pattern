package com.streams.practice;

import java.util.List;
import java.util.Objects;

public class Practice2 {
    public static void main(String[] args) {
        List<Employee1> employees1 = List.of(
                new Employee1("Guru", List.of("Java", "Spring", "Docker")),
                new Employee1("Amar", List.of("Python", "Docker", "AWS")),
                new Employee1("Sunil", List.of("Java", "Kubernetes", "AWS")),
                new Employee1("Kiran", List.of("Spring", "Angular", "MongoDB"))
        );
        System.out.println(uniqueSkills(employees1));
    }

    public static List<String > uniqueSkills(List<Employee1> employee1) {
        List<String> list = employee1.parallelStream().flatMap(e ->e.getSkills().stream())
                .filter(Objects::nonNull)
                .filter(s ->  !s.isBlank())
                .map(String::trim)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();
        return list;

         }
}
