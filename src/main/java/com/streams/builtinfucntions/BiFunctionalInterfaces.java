package com.streams.builtinfucntions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.IntStream;

record Employee1(int id, String name, double salary, String dept){};
public class BiFunctionalInterfaces {
    public static void main(String[] args) {
        BiPredicate<String, Integer > validateLength =  (s1, len) -> len==s1.length();

        System.out.println(validateLength.test("Guru", 4));
        System.out.println(validateLength.test("Durga",3));

        BiPredicate<Employee1, String> belongsToDept = (emp, dept) -> emp.dept().equalsIgnoreCase(dept);
        Employee1 e1 = new Employee1(1, "Guru", 10000, "IT");
        boolean test = belongsToDept.test(e1, "IT");
        System.out.println(test);

        //Chaining Example
        Predicate<String> startsWithS = s -> s.startsWith("G");

        BiPredicate<String, Integer> startsWith = (s, len) -> s.startsWith("G");

        if(validateLength.test("Guru", 4) && startsWithS.test("Guru")) {
            System.out.println("validated with name");
        }

        boolean test1 = validateLength.and(startsWith).test("Guru", 4);
        System.out.println(test1);

        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a+b;
        System.out.println(addition.apply(10,20));

        //The binary function is same as above only when the Input parameters and return type are similer
        BinaryOperator<Integer> addtion1 = (a,b) -> a+b;
        System.out.println(addtion1.apply(10,200));

        // MergeEmpInfo +Bonus
        BiFunction<Employee1, Double, Employee1> withBonus = (emp, bonus) -> new Employee1(emp.id(), emp.name(), emp.salary()+bonus,emp.dept());

        Employee1 employee1 = new Employee1(25, "Siddu", 1000, "CSE");
        Employee1 apply = withBonus.apply(employee1, 25000.00);
        System.out.println(apply);

        BiFunction<Integer, Integer, Integer> add1 = Integer::sum;
        Function<Integer, String> res = r -> "Result is "+r;
        System.out.println(add1.andThen(res).apply(200,100));

        // Dual Input for COnsumer
        BiConsumer<String, Integer> display = (name, age) -> System.out.println("The Name is "+name+" and the Age is "+age);

        display.accept("Guruputra",33);

        Map<String, Integer> marks = Map.of("Math", 90, "Science", 100, "English", 75);
        BiConsumer<String, Integer> info = (subject, mark) -> System.out.println("The Subject is "+subject +" he owned the marks is "+mark);
        marks.forEach(info);

        BiPredicate<Employee1, String> filterByDept = (emp, dept) -> emp.dept().equalsIgnoreCase(dept);
        BiPredicate<Employee1, Integer> hasSalaryAbove = (emp, sal) -> emp.salary() > sal;
        BiFunction<Employee1, Integer, Employee1> addBounus = (emp, bonus) -> new Employee1(emp.id(), emp.name(), emp.salary()+bonus,emp.dept());
        Consumer<Employee1> printInfo = (emp) -> System.out.println(emp);

        System.out.println("The list of employee");
        List<Employee1> employee1s = List.of(
                new Employee1(1, "Guru", 1000, "CSE"),
                new Employee1(2, "Kiran", 2000, "ISE"),
                new Employee1(3, "Kamath", 5000, "ECE"),
                new Employee1(1, "Guru", 50000,"IT"),
                new Employee1(2, "Durga",  45000,"HR"),
                new Employee1(3, "Mahesh",  70000,"IT")
        );
        employee1s.stream().filter(e -> filterByDept.test(e,"IT") && hasSalaryAbove.test(e, 2000))
                .map(e -> addBounus.apply(e, 100))
                .forEach(printInfo);


        List<Employee1> employee1s1 = List.of(new Employee1(1, "Guru", 50000, "IT"),
                new Employee1(2, "Durga", 45000, "HR"),
                new Employee1(3, "Mahesh", 70000, "IT"));
        List<Employee1> employee1s2 = List.of(new Employee1(1, "Guru", 1000, "CSE"),
                new Employee1(2, "Kiran", 2000, "ISE"),
                new Employee1(3, "Kamath", 5000, "ECE"));

        BiPredicate<Employee1, Employee1> checkTwoList = (emp1, emp2) -> emp1.name().equalsIgnoreCase(emp2.name());
        IntStream.range(0, employee1s1.size()).forEach( i -> System.out.println(checkTwoList.test(employee1s1.get(i), employee1s2.get(i))));

    }
}
